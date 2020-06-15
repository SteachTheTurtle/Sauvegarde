package com.steachtheturtle.fork_join;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {

		/*
		 * Path chemin = Paths.get("/usr/"); String filtre = "*.txt"; FolderScanner fs =
		 * new FolderScanner(chemin, filtre);
		 * 
		 * try { Long start = System.currentTimeMillis(); Long resultat =
		 * fs.sequentialScan(); Long end = System.currentTimeMillis();
		 * System.out.println("Il y a " + resultat + " fichier(s) portant l'extension "
		 * + filtre); System.out.println("Temps de traitement : " + (end - start)); }
		 * catch (ScanException e) { e.printStackTrace(); }
		 */

		Path chemin = Paths.get("/usr/");
		String filtre = "*.txt";

		// Création de notre tâche principale qui se charge de découper son travail en
		// sous-tâches
		FolderScannerImprove fs = new FolderScannerImprove(chemin, filtre);

		// Nous récupérons le nombre de processeurs disponibles
		int processeurs = Runtime.getRuntime().availableProcessors();
		// Nous créons notre pool de thread pour nos tâches de fond
		ForkJoinPool pool = new ForkJoinPool(processeurs);
		Long start = System.currentTimeMillis();

		// Nous lançons le traitement de notre tâche principale via le pool
		pool.invoke(fs);

		Long end = System.currentTimeMillis();
		System.out.println("Il y a " + fs.getResultat() + " fichier(s) portant l'extension " + filtre);
		System.out.println("Temps de traitement : " + (end - start));

	}
}
