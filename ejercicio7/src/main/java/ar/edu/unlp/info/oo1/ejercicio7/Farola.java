package ar.edu.unlp.info.oo1.ejercicio7;

import java.util.ArrayList;

public class Farola {
	private Boolean state = false;
	private ArrayList<Farola> vecinos = new ArrayList<Farola>
	();
	
	public Farola () {

	}
	
	public void turnOn() {
		if (this.state == false) {
			this.state = true;
			this.vecinos.forEach(f -> f.turnOn());
		}
	}
	
	public void turnOff() {
		if (this.state == true) {
			this.state = false;
			this.vecinos.forEach(f -> f.turnOff());
		}
	}
	
	public Boolean isOn() {
		return this.state;
	}
	
	public Boolean isOff() {
		if (this.state == true) {
			return false;
		}
		else
			return true;
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		this.vecinos.add(otraFarola);
		otraFarola.vecinos.add(this);
	}
	
	public ArrayList<Farola> getNeighbors(){
		return this.vecinos;
	}
}
