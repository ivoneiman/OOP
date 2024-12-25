package ar.edu.unlp.info.oo1.ejercicio23;

public class Domicilio implements Envio{

	
	public double calcularEnvio() {
		return this.calcularDistancia()*0.50;
	}

	// Implementación propia de CalculadoraDeDistancia
	
	public double calcularDistancia() {
		return 100;
	}
	
	
}
