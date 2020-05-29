package com.steachtheturtle.interface_non_abstraite;

public interface Pondre extends Reproduction {

	public static void description() {
		Reproduction.description();
		System.out.println("Redéfinie dans Pondre.java");
	}

	default void reproduire() {
		System.out.println("Je ponds des oeufs !");
	}

}
