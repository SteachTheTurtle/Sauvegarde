package com.steachtheturtle.ihm.button.action;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame implements ActionListener {

	// Classe écoutant notre second bouton
	class Bouton2Listener implements ActionListener {
		// Redéfinition de la méthode actionPerformed()
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("Vous avez cliqué sur le bouton 2");

			animated = false;
			bouton.setEnabled(true);
			bouton2.setEnabled(false);

		}

	}

	// Classe écoutant notre premier bouton
	class BoutonListener implements ActionListener {
		// Redéfinition de la méthode actionPerformed()
		@Override
		public void actionPerformed(ActionEvent arg0) {
			label.setText("Vous avez cliqué sur le bouton 1");

			t = new Thread(new PlayAnimation());
			t.start();

			animated = true;
			bouton.setEnabled(false);
			bouton2.setEnabled(true);

		}
	}

	class PlayAnimation implements Runnable {
		@Override
		public void run() {
			go();
		}
	}

	private Panneau pan = new Panneau();

	/*
	 * class Bouton3Listener implements ActionListener { // Redéfinition de la
	 * méthode actionPerformed()
	 *
	 * @Override public void actionPerformed(ActionEvent e) {
	 * System.out.println("Ma classe interne numéro 3 écoute bien !"); } }
	 */

	// private JButton bouton = new Bouton("mon bouton");
	private JButton bouton = new JButton("Go");

	private JButton bouton2 = new JButton("Stop");
	private JPanel container = new JPanel();
	private int compteur = 0;
	private boolean animated = true;
	private boolean backX, backY;
	private int x, y;
	private Thread t;

	private JLabel label = new JLabel("Le JLabel");

	public Fenetre() {
		this.setTitle("Animation");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		container.add(pan, BorderLayout.CENTER);

		// Nous ajoutons notre fenêtre à la liste des auditeurs de notre bouton
		// bouton.addActionListener(this);
		// container.add(bouton, BorderLayout.SOUTH);

		// bouton.addActionListener(this);
		// bouton2.addActionListener(this);

		// Ce sont maintenant nos classes internes qui écoutent nos boutons
		bouton.addActionListener(new BoutonListener());
		// Deuxième classe écoutant mon premier bouton
		// bouton.addActionListener(new Bouton3Listener());
		bouton2.addActionListener(new Bouton2Listener());

		JPanel south = new JPanel();
		south.add(bouton);
		south.add(bouton2);
		container.add(south, BorderLayout.SOUTH);

		// Définition d'une police d'écriture
		Font police = new Font("Tahoma", Font.BOLD, 16);
		// On l'applique au JLabel
		label.setFont(police);
		// Changement de la couleur du texte
		label.setForeground(Color.blue);
		// On modifie l'alignement du texte grâce aux attributs statiques
		// de la classe JLabel
		label.setHorizontalAlignment(JLabel.CENTER);

		container.add(label, BorderLayout.NORTH);
		this.setContentPane(container);
		this.setVisible(true);
		// go();

		t = new Thread(new PlayAnimation());
		t.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		// Lorsque l'on clique sur le bouton, on met à jour le JLabel
		// this.compteur++;
		// label.setText("Vous avez cliqué " + this.compteur + " fois");

		if (arg0.getSource() == bouton)
			label.setText("Vous avez cliqué sur le bouton 1");

		if (arg0.getSource() == bouton2)
			label.setText("Vous avez cliqué sur le bouton 2");

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
		while (animated) {
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
