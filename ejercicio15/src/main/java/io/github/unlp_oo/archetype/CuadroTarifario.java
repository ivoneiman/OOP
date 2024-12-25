package io.github.unlp_oo.archetype;

public class CuadroTarifario {
	private double precioKW;
	
	public CuadroTarifario(double precio, double factorDePotencia) {
		this.precioKW = precio;
	}
	
	public double getPrecioKW() {
		return this.precioKW;
	}
	
}
