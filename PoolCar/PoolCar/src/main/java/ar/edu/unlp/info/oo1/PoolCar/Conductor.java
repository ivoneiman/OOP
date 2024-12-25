package ar.edu.unlp.info.oo1.PoolCar;

public class Conductor extends Usuario{
	private Auto vehiculo;
	
	public Conductor (String nombre, double saldo, Auto vehiculo) {
		super(nombre,saldo);
		this.vehiculo = vehiculo;
	}

	public void cargarSaldo(double monto) {
		
	}
}
