package ar.edu.unlp.info.oo1.PoolCar;

public class Auto {
	private Conductor conductor;
	private String descripcion;
	private Usuario[] pasajeros;
	private int capacidad;
	private int cantidad;
	
	public Auto (Conductor c, String d, int N) {
		this.conductor = c;
		this.descripcion = d;
		this.pasajeros = new Usuario[N];
		this.capacidad = N;
		this.cantidad = 0;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public int getCapacidad() {
		return this.capacidad;
	}
	
	public boolean registrarPasajero(Usuario pasajero) {
		if (this.getCapacidad() > this.getCapacidad()) {
			this.pasajeros[cantidad]=pasajero;
			this.cantidad++;
			return true;
		}
		return false;
	}
}
