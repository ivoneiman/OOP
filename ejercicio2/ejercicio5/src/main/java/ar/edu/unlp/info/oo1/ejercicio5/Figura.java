package ar.edu.unlp.info.oo1.ejercicio5;

public abstract class Figura {
	private double perimetro;
	
	public Figura() {
		
	}
	
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public double getPerimetro() {
		return this.perimetro;
	}
	
	public abstract double getArea();
}
