package io.github.unlp_oo.ejercicio14a;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class DateLapseTest {
	
	public void testGetFromAndTo() {
		LocalDate from = LocalDate.of(2024, 1, 1);
		LocalDate to = LocalDate.of(2024, 1, 10);
		DateLapse lapse = new DateLapse(from,to);
		
		assertEquals(from, lapse.getFrom());
		assertEquals(to, lapse.getTo());
	}
	
	public void testSizeInDays() {
		LocalDate from = LocalDate.of(2024, 1, 1);
		LocalDate to = LocalDate.of(2024, 1, 10);
		DateLapse lapse = new DateLapse(from,to);
		
		assertEquals(9, lapse.sizeInDays()); // 10 días - 1 = 9 días de diferencia
	}
	
	public void testIncludesDate() {
		LocalDate from = LocalDate.of(2024, 1, 1);
		LocalDate to = LocalDate.of(2024, 1, 10);
		DateLapse lapse = new DateLapse(from,to);
		
		// Valores de borde
		assertTrue(lapse.includesDate(LocalDate.of(2024, 1, 1))); // Igual a from
		assertTrue(lapse.includesDate(LocalDate.of(2024, 1, 10))); // Igual a to
		
		// Fecha dentro del rango
		assertTrue(lapse.includesDate(LocalDate.of(2024, 1, 8)));
		
		// Fecha fuera del rango
		assertTrue(lapse.includesDate(LocalDate.of(2023, 12, 31))); // Antes de from
		assertTrue(lapse.includesDate(LocalDate.of(2025, 2, 11))); // Después de to
	}
	
	public void testInvalidDateRange() {
		LocalDate from = LocalDate.of(2024, 1, 10);
		LocalDate to = LocalDate.of(2024, 1, 1);
		
		// Verificamos que se lanza la excepción cuando 'to' es anterior a 'from'
		assertThrows(IllegalArgumentException.class, () -> {
			new DateLapse(from, to);
		});
	}
}
