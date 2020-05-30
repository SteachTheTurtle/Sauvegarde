package com.steachtheturtle.template;

import java.util.ArrayList;
import java.util.List;

public class Template {

	// Avec cette méthode, on accepte aussi bien les collections de Voiture que les
	// collection de VoitureSansPermis
	static void affiche(List<? super Voiture> list) {

		for (Object v : list)
			System.out.print(v.toString() + "\n");
	}

	public static void main(String[] args) {

		/*
		 * Solo<Integer> val = new Solo<Integer>(12); int nbre = val.getValeur();
		 *
		 * Solo<Integer> valI = new Solo<Integer>(); Solo<String> valS = new
		 * Solo<String>("TOTOTOTO"); Solo<Float> valF = new Solo<Float>(12.2f);
		 * Solo<Double> valD = new Solo<Double>(12.202568);
		 *
		 * int i = new Integer(12); // Est équivalent à int i = 12 double d = new
		 * Double(12.2586); // Est équivalent à double d = 12.2586 Double dd = 12.0;
		 * Character c = 'C'; ArrayList al = new ArrayList(); // Avant Java 5 il fallait
		 * faire al.add(new Integer(12)) // Depuis Java 5 il suffit de faire al.add(12);
		 *
		 * Duo<String, Boolean> dual = new Duo<String, Boolean>("toto", true);
		 * System.out.println("Valeur de l'objet dual : val1 = " + dual.getValeur1() +
		 * ", val2 = " + dual.getValeur2());
		 *
		 * Duo<Double, Character> dual2 = new Duo<Double, Character>(12.2585, 'C');
		 * System.out.println("Valeur de l'objet dual2 : val1 = " + dual2.getValeur1() +
		 * ", val2 = " + dual2.getValeur2());
		 *
		 * System.out.println("Liste de String");
		 * System.out.println("------------------------------");
		 *
		 * List<String> listeString = new ArrayList<String>();
		 * listeString.add("Une chaîne"); listeString.add("Une autre");
		 * listeString.add("Encore une autre"); listeString.add("Allez, une dernière");
		 *
		 * for (String str : listeString) System.out.println(str);
		 *
		 * System.out.println("\nListe de float");
		 * System.out.println("------------------------------");
		 *
		 * List<Float> listeFloat = new ArrayList<Float>(); listeFloat.add(12.25f);
		 * listeFloat.add(15.25f); listeFloat.add(2.25f); listeFloat.add(128764.25f);
		 *
		 * for (float f : listeFloat) System.out.println(f);
		 *
		 */

		/*
		 * // Liste de voiture List<Voiture> listVoiture = new ArrayList<Voiture>();
		 * listVoiture.add(new Voiture()); listVoiture.add(new Voiture());
		 * 
		 * List<Object> listVoitureSP = new ArrayList<Object>(); listVoitureSP.add(new
		 * Object()); listVoitureSP.add(new Object());
		 * 
		 * affiche(listVoiture); affiche(listVoitureSP);
		 */

		List<Voiture> listVoiture = new ArrayList<Voiture>();
		listVoiture.add(new Voiture());

		List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
		listVoitureSP.add(new VoitureSansPermis());

		Garage garage = new Garage();
		garage.add(listVoiture);
		System.out.println("--------------------------");
		garage.add(listVoitureSP);

	}

}
