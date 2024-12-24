package ar.edu.unlp.info.oo1.parcial_redictado;

import java.time.LocalDate;

public class Oferta implements Estrategia{
	private LocalDate limite;
	private double descuento; // Porcentaje de descuento
	
	public Oferta(LocalDate limite, double descuento) {
		this.limite = limite;
		this.descuento = descuento;
	}

	public double costoCompra(double precioBase) {
		if (this.isAfter()) {
			return precioBase * this.descuento;
		}
		return precioBase;
	}
	
	public double getPuntaje() {
		if (this.isAfter()) {
			return 10;
		}
		return 5;
	}
	
	public boolean isAfter() {
		if (LocalDate.now().isAfter(this.limite)){
			return true;
		}
		return false;
	}
}
