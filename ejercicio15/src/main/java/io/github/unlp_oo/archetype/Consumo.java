package io.github.unlp_oo.archetype;

public class Consumo {
	private double energiaActiva;
	private double energiaReactiva;
	
	public Consumo (double energiaActiva, double energiaReactiva) {
		this.energiaActiva = energiaActiva;
		this.energiaReactiva = energiaReactiva;
	}
	
	public double calcularMonto(CuadroTarifario tarifa) {
		return tarifa.getPrecioKW() * this.energiaActiva;
	}
	
	public boolean aplicaBonificacion(CuadroTarifario tarifa) {
		return energiaActiva / (
				Math.sqrt(
						Math.pow(energiaActiva, 2) +
						Math.pow(energiaReactiva, 2)
						)
				) > 0.8;
	}
}
