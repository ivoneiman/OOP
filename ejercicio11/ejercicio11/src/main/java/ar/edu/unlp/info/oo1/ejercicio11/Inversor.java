package ar.edu.unlp.info.oo1.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor (String nombre) {
		this.nombre = nombre;
		inversiones = new ArrayList<Inversion>();
	}
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(v -> v.valorActual()).sum(); // El valor actual de las inversiones de un inversor es la suma de los valores actuales de cada una de las inversiones en su cartera (su colección de inversiones).  
	}
	
	public boolean agregarInversion(Inversion inversion) {
		if (inversion != null)
				this.inversiones.add(inversion);
		else
			return false;
		return true;
	}
}
