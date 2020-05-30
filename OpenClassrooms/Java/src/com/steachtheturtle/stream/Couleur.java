package com.steachtheturtle.stream;

public enum Couleur {
	MARRON("marron"), BLEU("bleu"), VERT("vert"), VERRON("verron"), INCONNU("non déterminé"),
	ROUGE("rouge mais j'avais piscine...");

	private String name = "";

	Couleur(String n) {
		name = n;
	}

	@Override
	public String toString() {
		return name;
	}
}
