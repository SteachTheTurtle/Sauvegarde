package com.steachtheturtle.ihm.graphic;

import javax.swing.JFrame;

public class Fenetre extends JFrame {

	private Panneau pan = new Panneau();

	public Fenetre() {

		// Définit un titre pour notre fenêtre
		this.setTitle("Ma première fenêtre Java");
		// Définit sa taille : 300 pixels de large et 300 pixels de haut
		this.setSize(300, 300);
		// Nous demandons maintenant à notre objet de se positionner au centre
		this.setLocationRelativeTo(null);
		// Termine le processus lorsqu'on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Empêcher le redimensionnement de la fenêtre
		this.setResizable(true);
		// Garder la fenêtre au premier plan
		this.setAlwaysOnTop(true);
		// Retirer les contours et les boutons de contrôle
		this.setUndecorated(false);

		/*
		 * // Instanciation d'un objet JPanel JPanel pan = new JPanel(); // Définition
		 * de sa couleur de fond pan.setBackground(Color.ORANGE); // On prévient notre
		 * JFrame que notre JPanel sera son content pane this.setContentPane(pan);
		 */

		// this.setContentPane(new Panneau());

		this.setContentPane(pan);

		// Et enfin, la rendre visible
		this.setVisible(true);

		go();
	}

	private void go() {

		// Les coordonnées de départ de notre rond
		int x = pan.getPosX(), y = pan.getPosY();
		// Le booléen pour savoir si l'on recule ou non sur l'axe x
		boolean backX = false;
		// Le booléen pour savoir si l'on recule ou non sur l'axe y
		boolean backY = false;

		// Dans cet exemple, j'utilise une boucle while
		// Vous verrez qu'elle fonctionne très bien
		while (true) {
			// Si la coordonnée x est inférieure à 1, on avance
			if (x < 1)
				backX = false;

			// Si la coordonnée x est supérieure à la taille du Panneau moins la taille du
			// rond, on recule
			if (x > pan.getWidth() - 50)
				backX = true;

			// Idem pour l'axe y
			if (y < 1)
				backY = false;
			if (y > pan.getHeight() - 50)
				backY = true;

			// Si on avance, on incrémente la coordonnée
			// backX est un booléen, donc !backX revient à écrire
			// if (backX == false)
			if (!backX)
				pan.setPosX(++x);

			// Sinon, on décrémente
			else
				pan.setPosX(--x);

			// Idem pour l'axe Y
			if (!backY)
				pan.setPosY(++y);
			else
				pan.setPosY(--y);

			// On redessine notre Panneau
			pan.repaint();

			// Comme on dit : la pause s'impose ! Ici, trois millièmes de seconde
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
