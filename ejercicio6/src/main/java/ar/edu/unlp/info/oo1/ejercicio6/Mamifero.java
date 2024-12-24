package ar.edu.unlp.info.oo1.ejercicio6;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getMadre() {
		return this.madre;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
// Hay que preguntar si tiene padre/madre antes de hacer el llamado a la funcion dentro de este/esta
	
	public Mamifero getAbueloMaterno() {
		if (this.getMadre() != null)
			return this.getMadre().getPadre();
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.getMadre() != null)
			return this.getMadre().getMadre();
		return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.getPadre() != null)
			return this.getPadre().getPadre();
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.getPadre() != null) {
			return this.getPadre().getMadre();
		}
		return null;
	}
	
	/* public Boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean aux = false;
		while (aux == false) {
			if (this.getPadre() != null) {
				if (this.getPadre() == unMamifero)
					aux = true;
				else
					aux = this.getPadre().tieneComoAncestroA(unMamifero);
			}
			else if (this.getMadre() != null) {
				if (this.getMadre() == unMamifero)
					aux = true;
				else
					aux = this.getMadre().tieneComoAncestroA(unMamifero);
			}
		}
		return aux;
	} */
	
	
	// Tener dos métodos que retornen booleano si tiene padre o madre, y un método que maneje el recorrido
	public Boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean aux = false;
		if (this.getPadre() != null) {
			if (this.getPadre() == unMamifero)
				aux = true;
			else
				aux = this.getPadre().tieneComoAncestroA(unMamifero);
		}
		if (aux == false && (this.getMadre() != null)){
			if (this.getMadre() == unMamifero)
				aux = true;
			else
				aux = this.getMadre().tieneComoAncestroA(unMamifero);
		}
		return aux;
	}
}
