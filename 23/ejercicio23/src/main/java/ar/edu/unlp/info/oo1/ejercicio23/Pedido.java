package ar.edu.unlp.info.oo1.ejercicio23;

public class Pedido {
	private Cliente cliente;
	private Producto producto;
	private Pago pago;
	private Envio envio;
	private int cantidad;
	
	public Pedido (Cliente cliente, Producto producto, Pago pago, Envio envio, int cant) {
		this.cantidad = cant;
		this.envio = envio;
		this.pago = pago;
		this.producto = producto;
		this.cliente = cliente;
		producto.descontarUnidades(cant);
	}
	
	public double calcularCostoTotal() {
		return this.pago.costoTotal(this.producto.getPrecio()) + this.envio.calcularEnvio();
	}
	
	
}
