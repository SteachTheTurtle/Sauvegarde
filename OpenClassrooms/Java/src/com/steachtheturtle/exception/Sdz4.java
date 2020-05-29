package com.steachtheturtle.exception;

public class Sdz4 {

	public static void main(String[] args) {

		/*
		 * int j = 20, i = 0; try { System.out.println(j/i); } catch
		 * (ArithmeticException e) {
		 * System.out.println("Division par zéro ! - Message : " + e.getMessage()); }
		 * System.out.println("Coucou toi !");
		 * 
		 * try { System.out.println(" =>" + (1/0)); } catch (ClassCastException e) {
		 * e.printStackTrace(); } finally{
		 * System.out.println("Action faite systématiquement"); }
		 */

		Ville v = null;

		try {
			v = new Ville("Re", 12000, "France");
		}

		// Gestion de plusieurs exceptions différentes
		catch (NombreHabitantException | NomVilleException e2) {
			System.out.println(e2.getMessage());
		} finally {
			if (v == null)
				v = new Ville();
		}

		System.out.println(v.toString());

	}

}
