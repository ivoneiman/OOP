package ar.edu.unlp.info.oo1.parcial_redictado;

public class Normal implements Estrategia{
	
	public double costoCompra(double precioBase) {
		return precioBase;
	}
	
	public double getPuntaje() {
		return 10;
	}

}
