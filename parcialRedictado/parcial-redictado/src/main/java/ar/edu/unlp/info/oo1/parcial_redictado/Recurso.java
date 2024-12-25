package ar.edu.unlp.info.oo1.parcial_redictado;

import java.time.LocalDate;

public class Recurso {
	private Usuario user;
	private String descripcion;
	private LocalDate fecha;
	private double precioBase;
	private Estrategia estrategia;
	
	public Recurso(Usuario user, String descripcion, LocalDate fecha, double precioBase, Estrategia estrategia) {
		this.user = user;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.precioBase = precioBase;
		this.estrategia = estrategia;
	}
	
	
	public double getCosto() {
		return this.estrategia.costoCompra(this.precioBase); 
	}
	
	public double getPuntaje() {
		return this.precioBase * this.estrategia.getPuntaje();
	}
	
	
}
