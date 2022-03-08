package com.firstassimen.zoo;

public class Mamal {
	protected double energy = 100;
	public Mamal(int energy) {
		this.energy = energy;
	}
	
	protected double display() {
		System.out.println(this.energy);
		return this.energy;
	}
	

}
