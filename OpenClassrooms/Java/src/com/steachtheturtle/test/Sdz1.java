package com.steachtheturtle.test;

// import java.util.Scanner;

/**
 * 
 */

/**
 * @author Yannick
 *
 */
public class Sdz1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello World !");
		
		/*
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Veuillez saisir un mot :");
			String str = sc.nextLine();
			System.out.println("Vous avez saisi : " + str);
		}
		*/
		
		/*
		
		Ville v = new Ville();
		
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());
				
		Ville v1 = new Ville("Marseille", 1236, "France");
		
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());
				
		Ville v2 = new Ville("Rio", 321654, "Brésil");
		
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());
				        
		System.out.println("\n"+v1.decrisToi());
		System.out.println(v.decrisToi());
		System.out.println(v2.decrisToi()+"\n");
		System.out.println(v1.comparer(v2));
	
		*/
		
		//Définition d'un tableau de villes null
		Ville[] tableau = new Ville[6];
		        
		//Définition d'un tableau de noms de Villes et un autre de nombres d'habitants
		String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		         
		//Les trois premiers éléments du tableau seront des Villes
		//et le reste des capitales
		for(int i = 0; i < 6; i++){
		  if (i <3){
		    Ville V = new Ville(tab[i], tab2[i], "france");
		    tableau[i] = V;
		  }
		         
		  else{
		    Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
		    tableau[i] = C;
		  }
		}
		                 
		//Il ne nous reste plus qu'à décrire tout notre tableau !
		for(Object obj : tableau){
		  System.out.println(obj.toString()+"\n");
		}
		
	}

}
