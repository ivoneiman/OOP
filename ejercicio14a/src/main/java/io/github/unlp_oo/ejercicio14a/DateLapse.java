package io.github.unlp_oo.ejercicio14a;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {

	private LocalDate from;
	private LocalDate to;
	
	public DateLapse (LocalDate from, LocalDate to) {
		if (to.isBefore(from)){
			throw new IllegalArgumentException("La fecha 'to' no puede ser anterior a 'from'");
		}
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(from, to);
	}
	
	public boolean includesDate(LocalDate other) {
		return (other.isEqual(from) || other.isAfter(from)) && (other.isEqual(to) || other.isBefore(to)); 
	}
}
