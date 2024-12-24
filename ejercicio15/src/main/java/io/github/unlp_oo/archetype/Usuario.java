package io.github.unlp_oo.archetype;

import java.sql.Date;
import java.time.LocalDate;

import io.github.unlp_oo.archetype.Consumo;
import io.github.unlp_oo.archetype.Factura;

public class Usuario {
	private String nombre;
	private String domicilio;
	private Consumo ultimoConsumo;
	
	public Usuario (String nombre, String domicilio, Consumo consumo) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.ultimoConsumo = consumo;
	}
	
	public Factura facturar(CuadroTarifario tarifa) {
		double monto = this.ultimoConsumo.calcularMonto(tarifa); 
		double bonificacion = 0;
		if (this.ultimoConsumo.aplicaBonificacion(tarifa)) {
			bonificacion = monto * 0.1;
			monto = monto - bonificacion;
		}
		return new Factura(this, LocalDate.now(), bonificacion, monto);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDomicilio() {
		return this.domicilio;
	}
}
