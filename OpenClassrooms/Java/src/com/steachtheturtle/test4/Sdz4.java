package com.steachtheturtle.test4;

public class Sdz4 {

	public static void main(String[] args) {
		
		  int j = 20, i = 0;
		  try {
		    System.out.println(j/i);
		  } catch (ArithmeticException e) {
			System.out.println("Division par zéro ! - Message : " + e.getMessage());
		  }
		  System.out.println("Coucou toi !");
		  
		  try {
		    System.out.println(" =>" + (1/0));
		  } catch (ClassCastException e) {
		    e.printStackTrace();
		  }
		  finally{
		    System.out.println("Action faite systématiquement");
		  }

	}

}
