 package ar.edu.unlp.info.oo1.ejercicio11;

public class InversionEnAcciones implements Inversion{
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAcciones(String nombre, int cantidad, double valorUnitario) {
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.valorUnitario = valorUnitario;
	}
	
	public double valorActual() {
		return this.cantidad * this.valorUnitario; // El valor actual de una InversionEnAcciones se calcula multiplicando el número de acciones por el valor unitario de las mismas.
	}

	
}
