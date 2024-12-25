package io.github.unlp_oo.ejercicio17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
	private DateLapse dateLapse;
	private Propiedad propiedad;
	
	public Reserva(LocalDate from, LocalDate to, Propiedad propiedad) {
			if (to.isBefore(from)) {
				throw new IllegalArgumentException("La fecha 'to' no puede ser anterior a 'from'");
			}
		this.dateLapse = new DateLapse(from, to);
		this.propiedad = propiedad;
	}
	
	public boolean overlaps(LocalDate otherFrom, LocalDate otherTo) {
		return this.dateLapse.overlaps(otherFrom, otherTo);
	}
	
	public double ingresos() {
		return this.calcularPrecio();
	}
	
	public int getSizeInDays() {
		return (int) ChronoUnit.DAYS.between(this.dateLapse.getFrom(),this.dateLapse.getTo());
	}
	
	public double calcularPrecio() {
		return this.getSizeInDays() * this.propiedad.getPrecioNoche();
	}
	
	public boolean includesDate(DateLapse other) {
		return (other.getFrom().isEqual(dateLapse.getFrom()) || other.getFrom().isAfter(dateLapse.getFrom())) && (other.getTo().isEqual(dateLapse.getTo()) || other.getTo().isBefore(dateLapse.getTo())); 
	}
	
	public LocalDate getFrom() {
		return this.dateLapse.getFrom();
	}
	
	public LocalDate getTo() {
		return this.dateLapse.getTo();
	}
}
