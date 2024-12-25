package ar.edu.unlp.info.oo1.PoolCar;

public abstract class Usuario {

	private String nombre;
	private double saldo;
	
	public Usuario(String nombre, double saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public abstract void cargarSaldo(double monto);
}
