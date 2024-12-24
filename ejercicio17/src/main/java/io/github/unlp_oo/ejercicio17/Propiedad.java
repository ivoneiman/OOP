package io.github.unlp_oo.ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private int direccion;
	private String nombre;
	private double precioNoche;
	private ArrayList<Reserva> reservas;
	
	public Propiedad(int direccion, String nombre, double precioNoche) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precioNoche = precioNoche;
		reservas = new ArrayList<Reserva>();
	}
	
	public boolean isAvailable(LocalDate otherFrom, LocalDate otherTo) {
		/*
		for (Reserva reserva : reservas) {
			if (reserva.overlaps(otherFrom, otherTo)) {
				return false;
			}
		}
		*/
		
		// return reservas.stream().filter(r -> r.overlaps(otherFrom, otherTo)).findFirst().isPresent();

		return reservas.stream().anyMatch(r -> r.overlaps(otherFrom, otherTo));
	}
	
	public void crearReserva(LocalDate otherFrom, LocalDate otherTo) {
		Reserva reservaNueva = new Reserva(otherFrom, otherTo, this);
		
		if (this.isAvailable(otherFrom, otherTo)){
			reservas.add(reservaNueva);
		}
	}
	
	public void cancelarReserva(Reserva reserva) {
			reservas.remove(reserva);
	}
	
	public double getPrecioNoche() {
		return this.precioNoche;
	}
	
	/*
	Calcular los ingresos de un propietario: Se debe calcular la retribución a un propietario, 
	la cual es el 75% de la suma de precio totales de las reservas incluidas en un período específico de tiempo.
	  */
	public double ingresos(DateLapse other) {
		
		return reservas.stream().filter(r -> r.includesDate(other)).mapToDouble(r -> r.calcularPrecio()).sum() * 0.75;
	}
}
