package com.steachtheturtle.test3;

public interface Mitose extends Reproduction {
	
	public static void description() {
		Reproduction.description();
		System.out.println("Redéfinie dans Mitose.java");
	}
	
	default void reproduire() {
		System.out.println("Je me divise !");
	}
}
