package com.steachtheturtle.strategy;

public class Marcher implements Deplacement {
	@Override
	public void deplacer() {
		System.out.println("Je me déplace en marchant.");
	}
}
