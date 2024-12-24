package io.github.unlp_oo.archetype;

import java.time.LocalDate;
import java.util.Date;

public class Factura {
	private Usuario user;
	private LocalDate fecha;
	private double bonificacion;
	private double montoFinal;
	
	public Factura (Usuario user, LocalDate fecha, double bonificacion, double montoFinal) {
		this.user = user;
		this.fecha = fecha;
		this.bonificacion = bonificacion;
		this.montoFinal = montoFinal;
	}
}
