package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {
		super();
	}

	protected boolean puedeExtraer(double monto) {
		if (this.getSaldo() >= (monto + (monto*0.02))) {
			return true;
		}
		return false;
	}
	
	// es necesario implementarlo así para que funcione? en teoría no busca en el super el método si no está declarado acá?
	/* public boolean extraer(double monto) {
		return super.extraer(monto);
	}*/
	
	public void depositar(double monto) {
		super.depositar(monto - monto*0.02);
	}
	
}
