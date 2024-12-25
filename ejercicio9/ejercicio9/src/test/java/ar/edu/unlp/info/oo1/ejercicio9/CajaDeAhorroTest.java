package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CajaDeAhorroTest {

	private CajaDeAhorro cajaDeAhorroUno;
	private CajaDeAhorro cajaDeAhorroDos;
	private CajaDeAhorro cajaDeAhorroTres;
	private CuentaCorriente cuentaCorrienteUno;
	private CuentaCorriente cuentaCorrienteDos;

	@BeforeEach
	void setUp() throws Exception {
		this.cajaDeAhorroUno = new CajaDeAhorro();
		this.cajaDeAhorroDos = new CajaDeAhorro();
		this.cuentaCorrienteUno = new CuentaCorriente();
		this.cuentaCorrienteDos = new CuentaCorriente();
		
		cajaDeAhorroUno.depositar(100);
		cajaDeAhorroDos.depositar(20000);
		cuentaCorrienteUno.depositar(5000);
		cuentaCorrienteDos.depositar(233);
	}

	@Test
	void testExtraer() {
		assertFalse(cajaDeAhorroUno.extraer(9000), "No puede extraer 9000");
		assertTrue(cajaDeAhorroDos.extraer(9000), "Puede extraer 9000");
		assertFalse(cuentaCorrienteUno.extraer(5001), "No puede extraer 9000");
		assertTrue(cuentaCorrienteDos.extraer(233), "Puede extraer 233");
	}
	
	/* @Test
	void testDepositar() {
		cajaDeAhorroUno.depositar(100);
		cajaDeAhorroDos.depositar(20000);
		cuentaCorrienteUno.depositar(5000);
		cuentaCorrienteDos.depositar(233);
	} */
	
	void testGetSaldo() {
		
	}

	@Test
	void testTransferir() {
		this.cajaDeAhorroTres = new CajaDeAhorro();
		cajaDeAhorroTres.depositar(5000);
		assertTrue(cajaDeAhorroTres.transferirACuenta(250, cuentaCorrienteUno));
		assertTrue(cajaDeAhorroTres.transferirACuenta(250, cajaDeAhorroUno), "Caja de ahorro Uno le puede transferir 250 a la dos");
		assertFalse(cajaDeAhorroUno.transferirACuenta(250, cuentaCorrienteDos), "No puede transferirle por fondos insuficientes");
	}
	
	
}
