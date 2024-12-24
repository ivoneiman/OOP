package ar.edu.info.unlp.balanzaElectronica.impl;

import ar.edu.info.unlp.balanzaElectronica.Producto;

public class ProductoImpl implements Producto {

	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public ProductoImpl () {
		
	}
	
	
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public String getDescripcion () {
		return this.descripcion;
	}
	
	public void setPeso (double peso) {
		this.peso = peso;
	}
	
	public void setPrecioPorKilo (double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
	
	public void setDescripcion (String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getPrecio() {
		return (this.peso * this.precioPorKilo);
	}

	
}
