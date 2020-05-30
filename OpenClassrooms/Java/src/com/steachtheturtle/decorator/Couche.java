package com.steachtheturtle.decorator;

public abstract class Couche extends Patisserie {
	protected Patisserie pat;
	protected String nom;

	public Couche(Patisserie p) {
		pat = p;
	}

	@Override
	public String preparer() {
		String str = pat.preparer();
		return str + nom;
	}
}
