package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuadrado extends Figura{
	private double lado;

	public void setPerimetro(double perimetro) {
		super.setPerimetro(perimetro);
	}
	
	public double getPerimetro() {
		return (this.getLado()*4);
	}
	
	public void setLado(double lado) {
		this.lado=lado;
	}
	
	public double getLado () {
		return this.lado;
	}
	
	public double getArea() {
		return (this.getLado()*this.getLado());
	}
	
	
}
