package com.steachtheturtle.flux;

//Package à importer
import java.io.Serializable;

public class Game implements Serializable {
	private String nom, style;
	private double prix;
	private Notice notice;

	// Maintenant, cette variable ne sera pas sérialisée
	// Elle sera tout bonnement ignorée !
	// private transient Notice notice;

	public Game(String nom, String style, double prix) {
		this.nom = nom;
		this.style = style;
		this.prix = prix;
		this.notice = new Notice();
	}

	@Override
	public String toString() {
		return "Nom du jeu : " + this.nom + "\nStyle de jeu : " + this.style + "\nPrix du jeu : " + this.prix + "\n";
	}
}
