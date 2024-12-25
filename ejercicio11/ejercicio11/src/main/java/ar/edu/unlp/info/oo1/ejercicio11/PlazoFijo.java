package ar.edu.unlp.info.oo1.ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class PlazoFijo implements Inversion{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	public double valorActual() {
		double valor = 0;
		int tiempo = (int) ChronoUnit.DAYS.between(LocalDate.now(), this.fechaDeConstitucion);
		for (int i = 0; i<=tiempo ; i++) {
			valor = this.montoDepositado + this.montoDepositado * this.porcentajeDeInteresDiario;
		}
		return valor; // El valor actual de un PlazoFijo equivale al montoDepositado incrementado como corresponda por el porcentaje de interés diario, desde la fecha de constitución a la fecha actual (la del momento en el que se hace el cálculo).  
	}
}
