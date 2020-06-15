package com.steachtheturtle.observer;

public interface Observable {

	public void addObservateur(Observateur obs);

	public void delObservateur();

	public void updateObservateur();
}
