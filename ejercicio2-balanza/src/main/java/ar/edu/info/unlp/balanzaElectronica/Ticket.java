package ar.edu.info.unlp.balanzaElectronica;

import java.time.LocalDate;

public interface Ticket {

	double impuesto();
	
	void setFecha(LocalDate fecha);
	
	/*void setCantidadDeProductos(int cant);
	
	void setPrecioTotal(double precioTotal);
	
	void setPesoTotal(double pesoTotal);*/
	
	LocalDate getFecha();
	
	int getCantidadDeProductos();
	
	double getPrecioTotal();
	
	double getPesoTotal();
}
