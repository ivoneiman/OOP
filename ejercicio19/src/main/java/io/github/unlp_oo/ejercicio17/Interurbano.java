package io.github.unlp_oo.ejercicio17;

public class Interurbano extends Envio{
	private double distancia;
	
	public Interurbano(/*Params super*/ double distancia) {
		this.distancia=distancia;
	}
	
	public double calcularMonto() {
		
		if (this.distancia<100) {
			//return super.getPesoEnGramos * 20;
		}
		else if (this.distancia<500) {
			//return super.getPesoEnGramos * 25;
		}
		else {
			//return super.getPesoEnGramos * 30;
		}
		
		return 3;
	}
}
