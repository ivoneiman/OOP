package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuerpo3D {
	private double altura;
	private Figura caraBasal;

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen() {
		return (this.caraBasal.getArea() * this.getAltura());
	}
	
	public double getSuperficieExterior() {
		return(this.caraBasal.getArea() * 2 + this.caraBasal.getPerimetro() * this.getAltura());
	}
}
