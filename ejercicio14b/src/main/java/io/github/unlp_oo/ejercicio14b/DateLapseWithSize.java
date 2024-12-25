package io.github.unlp_oo.ejercicio14b;

import java.time.LocalDate;

public class DateLapseWithSize {
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapseWithSize(LocalDate from, int sizeInDays) {
		if (sizeInDays < 0) {
			throw new IllegalArgumentException("El nro de días no puede ser negativo");
		}
		this.from=from;
		this.sizeInDays=sizeInDays;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return from.plusDays(sizeInDays); 
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	public boolean includesDate(LocalDate other) {
		return (other.isEqual(from) || other.isAfter(from)) && (other.isEqual(this.getTo()) || other.isBefore(this.getTo()));
	}
}
