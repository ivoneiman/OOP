package ar.edu.info.unlp.balanzaElectronica;

public interface Balanza {

	void ponerEnCero();
	
	void agregarProducto(Producto producto);
	
	Ticket emitirTicket ();
	
	double getPrecioTotal();
		
	double getPesoTotal();
	
	int getCantidadDeProductos();
}
