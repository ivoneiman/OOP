package io.github.unlp_oo.ejercicio17;

public class Local extends Envio{
	private Boolean entregaRapida;
	private double precioFijo;

	public Local(/*DateLapse fecha, etc */Boolean entregaRapida) {
		super();
		if (entregaRapida) {
			this.precioFijo=1500;
		}
		else
			this.precioFijo=1000;
	}
	
	public double calcularMonto() {
			return this.precioFijo;
	}
}
