package ar.edu.unlp.info.oo1.ejercicio23;

public class Producto {
	private String nombre;
	private String categoria;
	private double precio;
	private int unidades;
	
	public Producto(String n, String c, double p, int u) {
		this.nombre = n;
		this.categoria = c;
		this.precio = p;
		this.unidades = u;
	}

	public String getCategoria() {
		return this.categoria;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public boolean isAvailable(int cant) {
		if (this.unidades >= cant) {
			return true;
		}
		return false;
	}
	
	public void descontarUnidades(int cantDescontar) {
		this.unidades -= cantDescontar;
	}
}
