package ar.edu.unlp.info.oo1.parcial_redictado;

public class Compra {
	private Usuario user;
	private Recurso recurso;
	private double precio;
	
	public Compra(Usuario user, Recurso recurso) {
		this.user = user;
		this.recurso = recurso;
		this.precio = recurso.getCosto();
	}
	
	public void registrarPuntaje() {
		this.user.aumentarPuntaje(this.recurso.getPuntaje());
	}
	
	
	
}
