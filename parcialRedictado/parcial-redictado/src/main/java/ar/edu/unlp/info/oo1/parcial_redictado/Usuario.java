package ar.edu.unlp.info.oo1.parcial_redictado;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String email;
	private double puntaje;
	private ArrayList<Recurso> recursos;
	private ArrayList<Compra> compras;
	
	public Usuario(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
		this.recursos = new ArrayList<Recurso>();
		this.compras = new ArrayList<Compra>();
	}
	
	public void registrarRecurso(Recurso r) {
		if (this.recursos.isEmpty()) {
			this.puntaje = 0;
		}
		this.recursos.add(r);
	}
	
	public void aumentarPuntaje(double aumento) {
		this.puntaje += aumento;
	}
}
