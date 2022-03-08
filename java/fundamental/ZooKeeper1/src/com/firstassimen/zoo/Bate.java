package com.firstassimen.zoo;

public class Bate extends Mamal {
	public Bate() {
		super(300);
	}
public void attackTown() {
	System.out.println("i can attack town");
	super.energy -=100;
}
public void eatHuman() {
	System.out.println("i can eat people");
	super.energy +=25;
}
public void fly() {
	System.out.println("i can fly");
	super.energy -=50;
}
}
