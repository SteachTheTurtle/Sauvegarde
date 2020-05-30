package com.steachtheturtle.reflexivite;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflexivite {

	public static void main(String[] args) {

		/*
		 * Class c = String.class; Class c2 = new String().getClass(); // La fameuse
		 * méthode finale dont je vous parlais dans le chapitre sur // l'héritage //
		 * Cette méthode vient de la classe Object
		 *
		 * System.out.println( "La superclasse de la classe " + String.class.getName() +
		 * " est : " + String.class.getSuperclass());
		 *
		 * // La méthode getInterfaces retourne un tableau de Class Class[] faces =
		 * c.getInterfaces(); // Pour voir le nombre d'interfaces
		 * System.out.println("Il y a " + faces.length + " interfaces implémentées"); //
		 * On parcourt le tableau d'interfaces for (int i = 0; i < faces.length; i++)
		 * System.out.println(faces[i]);
		 */

		/*
		 * Method[] m = c.getMethods();
		 *
		 * System.out.println("Il y a " + m.length + " méthodes dans cette classe"); //
		 * On parcourt le tableau de méthodes // On parcourt le tableau de méthodes for
		 * (int i = 0; i < m.length; i++) { System.out.println(m[i]);
		 *
		 * Class[] p = m[i].getParameterTypes(); for (int j = 0; j < p.length; j++)
		 * System.out.println(p[j].getName());
		 *
		 * System.out.println("----------------------------------\n"); }
		 */

		/*
		 * Field[] m = c.getDeclaredFields();
		 *
		 * System.out.println("Il y a " + m.length + " champs dans cette classe"); // On
		 * parcourt le tableau de méthodes for (int i = 0; i < m.length; i++)
		 * System.out.println(m[i].getName());
		 *
		 * Constructor[] construc = c.getConstructors(); System.out.println("Il y a " +
		 * construc.length + " constructeurs dans cette classe"); // On parcourt le
		 * tableau des constructeurs for (int i = 0; i < construc.length; i++) {
		 * System.out.println(construc[i].getName());
		 *
		 * Class[] param = construc[i].getParameterTypes(); for (int j = 0; j <
		 * param.length; j++) System.out.println(param[j]);
		 *
		 * System.out.println("-----------------------------\n"); }
		 */

		String nom = Paire.class.getName();
		try {
			// On crée un objet Class
			Class cl = Class.forName(nom);
			// Nouvelle instance de la classe Paire
			Object o = cl.newInstance();

			// On crée les paramètres du constructeur
			Class[] types = new Class[] { String.class, String.class };
			// On récupère le constructeur avec les deux paramètres
			Constructor ct = cl.getConstructor(types);

			// On instancie l'objet avec le constructeur surchargé !
			Object o2 = ct.newInstance(new String[] { "valeur 1 ", "valeur 2" });

			// On va chercher la méthode toString, elle n'a aucun paramètre
			Method m = cl.getMethod("toString", null);
			// La méthode invoke exécute la méthode sur l'objet passé en paramètre
			// Pas de paramètre, donc null en deuxième paramètre de la méthode invoke !

			System.out.println("----------------------------------------");
			System.out.println("Méthode " + m.getName() + " sur o2: " + m.invoke(o2, null));
			System.out.println("Méthode " + m.getName() + " sur o: " + m.invoke(o, null));

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
