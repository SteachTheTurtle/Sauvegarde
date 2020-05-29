package com.steachtheturtle.polymorphisme_interface;

public class Tigre extends Felin {

	public Tigre() {

	}

	public Tigre(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}

	@Override
	void crier() {
		System.out.println("Je grogne très fort !");
	}
}
