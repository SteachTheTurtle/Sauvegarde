package com.steachtheturtle.decorator;

public class CoucheBiscuit extends Couche {
	public CoucheBiscuit(Patisserie p) {
		super(p);
		this.nom = "\t- Une couche de biscuit.\n";
	}
}
