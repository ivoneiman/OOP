package ar.edu.info.unlp.balanzaElectronica.impl;

import java.util.ArrayList;
import java.util.List;

import ar.edu.info.unlp.balanzaElectronica.*;



public class BalanzaImpl implements Balanza{

//	private int cantidadDeProductos=0;
//	private double precioTotal=0;
//	private double pesoTotal=0;
	private List<Producto> productos=new ArrayList<Producto>();
	
	public BalanzaImpl () {
		
	}
	
	public void agregarProducto (Producto producto) {
		this.productos.add(producto);
	//	this.cantidadDeProductos++;
	//	this.precioTotal += (producto.getPrecioPorKilo() * producto.getPeso());
	//	this.pesoTotal += producto.getPeso();
	}
	
	public Ticket emitirTicket () {
		Ticket ticket = new TicketImpl (this.getProductos());
		return ticket;
	}
	
	
	public void ponerEnCero () {
		this.productos = new ArrayList<Producto>();
	}
	
	public List<Producto> getProductos(){
		return this.productos;
	}
	
	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(item -> item.getPrecio()).sum();
	//	return this.precioTotal;
	}
	
	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(item -> item.getPeso()).sum();
	//	return this.pesoTotal;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	//	this.productos.mapToInt(prod -> contar).sum();
	//	return this.cantidadDeProductos;
	}

	
	
	
	
}
