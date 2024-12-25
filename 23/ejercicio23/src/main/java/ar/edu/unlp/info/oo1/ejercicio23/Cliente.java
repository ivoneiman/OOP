package ar.edu.unlp.info.oo1.ejercicio23;

import java.util.ArrayList;
import java.util.HashMap;

public class Cliente extends Persona{
	
	private ArrayList<Pedido> pedidos;
	private HashMap<String, Integer> categorias;
	
	public Cliente(String n, String d) {
		super(n, d);
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public boolean existe(String categoria) {
		if (this.categorias.containsKey(categoria)) {
			return true;
		}
		return false;
	}
	
	private void agregarCategoria(String cateogira) {
		if(this.existe(cateogira)) {
			this.categorias.put(cateogira, this.categorias.get(cateogira)+1);	
		}
		else {
			this.categorias.put(cateogira, 1);
		}
	}
	
	public void crearPedido(Pago pago, Envio envio, Producto p, int cant) {
		if (p.isAvailable(cant)) {
			Pedido pedido = new Pedido(this, p, pago, envio, cant);
			this.pedidos.add(pedido);
			String cateogira = p.getCategoria();
			this.agregarCategoria(cateogira);
		}
	}
	
	
	public HashMap<String,Integer> cantidadProductosPedidos(){
		return this.categorias;
	}
	
}
