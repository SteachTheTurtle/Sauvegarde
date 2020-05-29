package com.steachtheturtle.strategy;

public class PremierSoin implements Soin {
	@Override
	public void soigner() {
		System.out.println("Je donne les premiers soins.");
	}
}
