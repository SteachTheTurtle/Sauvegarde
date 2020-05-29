package com.steachtheturtle.strategy;

public class AucunSoin implements Soin {
	@Override
	public void soigner() {
		System.out.println("Je ne donne AUCUN soin !");
	}
}
