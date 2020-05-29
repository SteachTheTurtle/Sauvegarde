package com.steachtheturtle.strategy;

public class CombatCouteau implements EspritCombatif {
	@Override
	public void combat() {
		System.out.println("Je me bats au couteau !");
	}
}
