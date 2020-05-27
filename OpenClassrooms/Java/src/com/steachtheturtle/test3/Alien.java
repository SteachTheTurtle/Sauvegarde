package com.steachtheturtle.test3;

public class Alien implements Pondre, Mitose {

	public void reproduire() {
		
		System.out.println("Je suis un alien et :");
		Pondre.super.reproduire();
		Mitose.super.reproduire();

	}
}
