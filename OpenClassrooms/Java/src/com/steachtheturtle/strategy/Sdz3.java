package com.steachtheturtle.strategy;

public class Sdz3 {

	public static void main(String[] args) {

		Personnage[] tPers = { new Guerrier(), new Civil(), new Medecin() };

		for (int i = 0; i < tPers.length; i++) {
			System.out.println("\nInstance de " + tPers[i].getClass().getName());
			System.out.println("**************************************************");
			tPers[i].combattre();
			tPers[i].seDeplacer();
			tPers[i].soigner();

		}

		System.out.println();

		Personnage pers = new Guerrier();
		pers.soigner();
		pers.setSoin(new Operation());
		pers.soigner();

		// Utilisation d'une classe anonyme
		pers.setSoin(new Soin() {

			@Override
			public void soigner() {
				System.out.println("Je soigne avec une classe anonyme ! ");

			}
		});

		pers.soigner();

	}
}
