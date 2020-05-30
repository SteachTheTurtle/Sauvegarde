package com.steachtheturtle.java.util.function;

public class Personne {

	public int age;
	public String nom;

	public Personne() {
		nom = "Inconnu";
		age = 0;
	}

	public Personne(int i, String string) {
		nom = string;
		age = i;
	}

	public int getAge() {
		return age;
	}

	public String getNom() {
		return nom;
	}

}
