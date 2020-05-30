package com.steachtheturtle.lambda;

public class Lambda {

	public static void main(String[] args) {

		// Class anonyme
		Dialoguer d = new Dialoguer() {
			@Override
			public void parler(String question) {
				System.out.println("Tu as dis : " + question);
			}
		};
		d.parler("Bonjour");

		// Lambda
		Dialoguer dd = (s) -> System.out.println("Tu as dis : " + s);
		dd.parler("Bonjour");

	}

}
