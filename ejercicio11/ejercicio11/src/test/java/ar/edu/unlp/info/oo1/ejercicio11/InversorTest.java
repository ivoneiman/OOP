package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	private Inversor inversor1;
	private Inversor inversor2;
	
	private InversionEnAcciones inversionAcciones1;
	private InversionEnAcciones inversionAcciones2;
	private PlazoFijo inversionPlazoFijo1;
	private PlazoFijo inversionPlazoFijo2;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		inversor1 = new Inversor("Juan");
		inversor2 = new Inversor("Carlos");
		
		inversionAcciones1 = new InversionEnAcciones("Acciones de Spotify", 120, 15); // nombre, cantidad, valor unitario
		inversionAcciones2 = new InversionEnAcciones("Acciones de Netflix", 500, 50);
		inversionPlazoFijo1 = new PlazoFijo(LocalDate.of(2020, 12, 20), 2000, 0.05); // fecha, monto depositado, porcentaje diario
		inversionPlazoFijo2 = new PlazoFijo(LocalDate.of(2022, 12, 20), 5000, 0.10);
	}

	@Test
	void testAgregarInversion() {
		assertTrue(inversor1.agregarInversion(inversionAcciones1), "Se pudo agregar una inversión");
		assertTrue(inversor2.agregarInversion(inversionAcciones2), "Se pudo agregar una inversión");
		assertTrue(inversor1.agregarInversion(inversionPlazoFijo1), "Se pudo agregar una inversión en plazo fijo");
		assertTrue(inversor2.agregarInversion(inversionPlazoFijo2), "Se pudo agregar una inversión en plazo fijo");
	}
	
}


