package com.steachtheturtle.strategy;

public class Pacifiste implements EspritCombatif {
	@Override
	public void combat() {
		System.out.println("Je ne combats pas !");
	}
}
