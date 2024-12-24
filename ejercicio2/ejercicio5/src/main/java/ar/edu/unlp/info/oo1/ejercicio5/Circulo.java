package ar.edu.unlp.info.oo1.ejercicio5;

public class Circulo extends Figura{
	private double radio;
	private double diametro;
	private double perimetro;
	
	public Circulo() {
		
	}
	
/*	public void setDiametro(double diametro) {
		this.diametro = diametro;
	} */
	
	public double getDiametro() {
		return this.diametro;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
		this.diametro = radio*2;
		this.perimetro = Math.PI*this.diametro;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setPerimetro(double perimetro) {
		this.perimetro = Math.PI*this.diametro;
	}
	
	public double getPerimetro() {
		return this.perimetro;
	}
	
	public double getArea() {
		return (Math.PI * this.getRadio() * this.getRadio());
	}
	
}
