package ar.edu.info.unlp.balanzaElectronica.impl;

import ar.edu.info.unlp.balanzaElectronica.Producto;
import ar.edu.info.unlp.balanzaElectronica.Ticket;

import java.time.LocalDate;
import java.util.List;

public class TicketImpl implements Ticket{

	private LocalDate fecha;
	private List<Producto> productos;
//	private double precioTotal;
	
	public TicketImpl () {
		
	}
	
	public TicketImpl(List<Producto> productos) {
		this.fecha = LocalDate.now();
		this.productos = productos;
	}	
	
	public double impuesto() {
		double aux = this.productos.stream().mapToDouble(prod -> prod.getPrecio()).sum() * 0.21;
		double aux2= this.productos.stream().
		return aux;
		
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(prod -> prod.getPeso()).sum();
	}
	
	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(prod -> prod.getPrecio()).sum();
	}
	
}
