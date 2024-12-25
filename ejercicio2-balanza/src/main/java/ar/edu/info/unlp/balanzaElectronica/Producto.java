package ar.edu.info.unlp.balanzaElectronica;

public interface Producto {
	
	void setPeso(double peso);
	
	void setPrecioPorKilo(double precioPorKilo);
	
	void setDescripcion (String descripcion);
	
	double getPeso();
	
	double getPrecioPorKilo();
	
	String getDescripcion();
	
	double getPrecio();
}
