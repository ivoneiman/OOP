package ar.edu.unlp.info.oo1.PoolCar;

import java.time.LocalDate;

public class Viaje {
	private String origen;
	private String destino;
	private double costo;
	private Auto vehiculo;
	private LocalDate fecha;
	
	public Viaje(String origen, String destino, double costo, Auto vehiculo, LocalDate fecha){
		this.origen = origen;
		this.destino = destino;
		this.costo = costo;
		this.vehiculo = vehiculo;
		this.fecha = fecha;
	}
	
	public int diasRestantes(LocalDate fecha) {
		return LocalDate.now().compareTo(fecha);
	}
	
	public boolean registrarPasajero(Usuario pasajero) {
		if (this.diasRestantes(fecha) >= 2 && (pasajero.getSaldo() > 0)) {
			return this.vehiculo.registrarPasajero(pasajero);
		}
		return false;
	}
}
