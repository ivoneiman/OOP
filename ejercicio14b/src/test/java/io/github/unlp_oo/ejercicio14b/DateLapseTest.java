package io.github.unlp_oo.ejercicio14b;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

public class DateLapseTest {

    // Tests para la implementación original (from, to)
    @Test
    public void testGetFromAndTo() {
        LocalDate from = LocalDate.of(2024, 1, 1);
        LocalDate to = LocalDate.of(2024, 1, 10);
        DateLapse lapse = new DateLapse(from, to);
        
        assertEquals(from, lapse.getFrom());
        assertEquals(to, lapse.getTo());
    }

    @Test
    public void testSizeInDays() {
        LocalDate from = LocalDate.of(2024, 1, 1);
        LocalDate to = LocalDate.of(2024, 1, 10);
        DateLapse lapse = new DateLapse(from, to);
        
        assertEquals(9, lapse.sizeInDays()); // 10 días - 1 = 9 días de diferencia
    }

    @Test
    public void testIncludesDate() {
        LocalDate from = LocalDate.of(2024, 1, 1);
        LocalDate to = LocalDate.of(2024, 1, 10);
        DateLapse lapse = new DateLapse(from, to);
        
        // Valores de borde
        assertTrue(lapse.includesDate(LocalDate.of(2024, 1, 1))); // Igual a from
        assertTrue(lapse.includesDate(LocalDate.of(2024, 1, 10))); // Igual a to
        
        // Fecha dentro del rango
        assertTrue(lapse.includesDate(LocalDate.of(2024, 1, 8)));
        
        // Fecha fuera del rango
        assertFalse(lapse.includesDate(LocalDate.of(2023, 12, 31))); // Antes de from
        assertFalse(lapse.includesDate(LocalDate.of(2024, 1, 11))); // Después de to
    }

    @Test
    public void testInvalidDateRange() {
        LocalDate from = LocalDate.of(2024, 1, 10);
        LocalDate to = LocalDate.of(2024, 1, 1);
        
        // Verificamos que se lanza la excepción cuando 'to' es anterior a 'from'
        assertThrows(IllegalArgumentException.class, () -> {
            new DateLapse(from, to);
        });
    }

    // Tests para la nueva implementación basada en 'from' y 'sizeInDays'
    @Test
    public void testGetFromAndToWithSizeInDays() {
        LocalDate from = LocalDate.of(2024, 1, 1);
        int sizeInDays = 9;
        DateLapseWithSize lapse = new DateLapseWithSize(from, sizeInDays);
        
        assertEquals(from, lapse.getFrom());
        assertEquals(from.plusDays(sizeInDays), lapse.getTo());
    }

    @Test
    public void testSizeInDaysWithSizeInDays() {
        LocalDate from = LocalDate.of(2024, 1, 1);
        int sizeInDays = 9;
        DateLapseWithSize lapse = new DateLapseWithSize(from, sizeInDays);
        
        assertEquals(sizeInDays, lapse.sizeInDays());
    }

    @Test
    public void testIncludesDateWithSizeInDays() {
        LocalDate from = LocalDate.of(2024, 1, 1);
        int sizeInDays = 9;
        DateLapseWithSize lapse = new DateLapseWithSize(from, sizeInDays);
        
        // Valores de borde
        assertTrue(lapse.includesDate(LocalDate.of(2024, 1, 1))); // Igual a from
        assertTrue(lapse.includesDate(LocalDate.of(2024, 1, 10))); // Igual a to
        
        // Fecha dentro del rango
        assertTrue(lapse.includesDate(LocalDate.of(2024, 1, 8)));
        
        // Fecha fuera del rango
        assertFalse(lapse.includesDate(LocalDate.of(2023, 12, 31))); // Antes de from
        assertFalse(lapse.includesDate(LocalDate.of(2024, 1, 11))); // Después de to
    }

    @Test
    public void testInvalidDateRangeWithSizeInDays() {
        LocalDate from = LocalDate.of(2024, 1, 1);
        int sizeInDays = -5;
        
        // Verificamos que se lanza la excepción cuando el número de días es negativo
        assertThrows(IllegalArgumentException.class, () -> {
            new DateLapseWithSize(from, sizeInDays);
        });
    }
}
