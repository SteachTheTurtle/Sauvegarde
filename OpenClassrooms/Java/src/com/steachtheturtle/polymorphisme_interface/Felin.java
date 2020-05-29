package com.steachtheturtle.polymorphisme_interface;

public abstract class Felin extends Animal {
	@Override
	void deplacement() {
		System.out.println("Je me déplace seul !");
	}
}
