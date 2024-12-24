package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {

	private CuentaCorriente cuentaCorrienteUno;
	private CuentaCorriente cuentaCorrienteDos;

	@BeforeEach
	void setUp() throws Exception {
		this.cuentaCorrienteUno = new CuentaCorriente();
		this.cuentaCorrienteDos = new CuentaCorriente();
	}

	@Test
	void testModulos() {
		assertFalse(cuentaCorrienteUno.extraer(9000), "puede extraer 9000");
	}

	@Test
	void testDepositar() {
		cuentaCorrienteDos.depositar(20000);
	}
	
	@Test
	void testTransferir() {
		assertTrue(cuentaCorrienteDos.transferirACuenta(20, cuentaCorrienteUno), "Caja de ahorro Uno le transfiere 20 a la dos");
	}
	
}
