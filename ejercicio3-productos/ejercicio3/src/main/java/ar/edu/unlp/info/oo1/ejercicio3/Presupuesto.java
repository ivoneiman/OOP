package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	private Item item;
	
	public Presupuesto() {
		
	}
	
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
		}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public LocalDate getFecha () {
		return this.fecha;
	}
	
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		return this.items.stream().mapToDouble(item -> item.costo()).sum();
	}
}
