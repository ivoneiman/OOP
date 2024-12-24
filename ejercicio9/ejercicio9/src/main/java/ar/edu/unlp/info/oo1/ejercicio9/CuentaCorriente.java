package ar.edu.unlp.info.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta{

	private double limiteDescubierto;
	
	public CuentaCorriente() {
		super();
		this.limiteDescubierto = 0;
	}
	
	protected boolean puedeExtraer(double monto) {
		if ((this.getSaldo() - monto) >= this.getDescubierto()) {
			return true;
		}
		return false;
	}
	
	public double getDescubierto() {
		return this.limiteDescubierto;
	}
	
	public void setDescubierto(double descubierto) {
		this.limiteDescubierto = descubierto;
	}
}
