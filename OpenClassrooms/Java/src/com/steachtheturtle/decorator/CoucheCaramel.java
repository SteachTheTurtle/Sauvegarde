package com.steachtheturtle.decorator;

public class CoucheCaramel extends Couche {
	public CoucheCaramel(Patisserie p) {
		super(p);
		this.nom = "\t- Une couche de caramel.\n";
	}
}
