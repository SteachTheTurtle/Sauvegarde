package com.steachtheturtle.strategy;

public class Courir implements Deplacement {
	@Override
	public void deplacer() {
		System.out.println("Je me déplace en courant.");
	}
}
