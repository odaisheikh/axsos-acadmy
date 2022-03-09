package com.firstassimen.zoo;

public class TestClass {

	public static void main(String[] args) {
		Bate attacker = new Bate();
		attacker.attackTown();
		attacker.attackTown();
		attacker.attackTown();
		attacker.eatHuman();
		attacker.eatHuman();
		attacker.fly();
		System.out.println(attacker.energy);
	}

}
