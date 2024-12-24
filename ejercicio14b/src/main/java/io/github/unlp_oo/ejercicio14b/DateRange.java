package io.github.unlp_oo.ejercicio14b;

import java.time.LocalDate;

public interface DateRange {

	LocalDate getFrom();
	LocalDate getTo();
	int sizeInDays();
	boolean includesDate(LocalDate other);
}
