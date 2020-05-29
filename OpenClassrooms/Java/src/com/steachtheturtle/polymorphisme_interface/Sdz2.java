package com.steachtheturtle.polymorphisme_interface;

public class Sdz2 {

	public static void main(String[] args) {

		/*
		 * Loup l = new Loup("Gris bleuté", 20); l.boire(); l.manger(); l.deplacement();
		 * l.crier(); System.out.println(l.toString());
		 */

		// Les méthodes d'un chien
		Chien c = new Chien("Gris bleuté", 20);
		c.boire();
		c.manger();
		c.deplacement();
		c.crier();
		System.out.println(c.toString());

		System.out.println("--------------------------------------------");
		// Les méthodes de l'interface
		c.faireCalin();
		c.faireLeBeau();
		c.faireLechouille();

		System.out.println("--------------------------------------------");
		// Utilisons le polymorphisme de notre interface
		Rintintin r = new Chien();
		r.faireCalin();
		r.faireLeBeau();
		r.faireLechouille();

	}

}
