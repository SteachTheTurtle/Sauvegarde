package com.steachtheturtle.enumtest;

public class EnumTest {

	public static void main(String[] args) {

		/*
		 * for (Langage lang : Langage.values()) { if (Langage.JAVA.equals(lang))
		 * System.out.println("J'aime le : " + lang); else
		 * System.out.println("J'aime moyen le : " + lang); }
		 */

		Langage l1 = Langage.JAVA;
		Langage l2 = Langage.PHP;

		l1.getEditor();
		l2.getEditor();

	}

}
