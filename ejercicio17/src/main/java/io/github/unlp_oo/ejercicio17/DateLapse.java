package io.github.unlp_oo.ejercicio17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		if (to.isBefore(from)) {
			throw new IllegalArgumentException("to debe ser más grande que for");
		}
		this.from = from;
		this.to = to;
	}
	
	public boolean overlaps(LocalDate otherFrom, LocalDate otherTo) {
		boolean overlap=false;
		if (otherFrom.isAfter(this.getFrom()) || otherFrom.isEqual(this.getFrom()) && (otherTo.isBefore(this.getTo()) || otherTo.equals(this.getTo()))){
			overlap=true;
		}
		return overlap;
	}
	
	public int getSizeInDays() {
		return (int) ChronoUnit.DAYS.between(this.getFrom(),this.getTo());
	}

	public boolean includesDate(DateLapse other) {
		return (other.getFrom().isEqual(from) || other.getFrom().isAfter(from)) && (other.getTo().isEqual(to) || other.getTo().isBefore(to)); 
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
}
