package ar.edu.unlp.info.oo1.ejercicio23;

public class Cuota implements Pago{

	
	public double costoTotal(double precioProducto) {
		return precioProducto + precioProducto*0.2;
	}

}
