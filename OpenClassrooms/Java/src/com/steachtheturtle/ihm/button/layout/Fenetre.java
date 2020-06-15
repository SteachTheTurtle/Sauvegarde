package com.steachtheturtle.ihm.button.layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {

	CardLayout cl = new CardLayout();
	JPanel content = new JPanel();
	// Liste des noms de nos conteneurs pour la pile de cartes
	String[] listContent = { "CARD_1", "CARD_2", "CARD_3" };
	int indice = 0;

	// Possibilité 1 : instanciation avec le libellé
	private JButton bouton = new JButton("Mon bouton");

	// Possibilité 2 : instanciation puis définition du libellé
	// private JButton bouton2 = new JButton();

	public Fenetre() {

		// Possibilité 2 : instanciation puis définition du libellé
		// bouton2.setText("Mon bouton");

		this.setTitle("Fenetre Bouton");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		// Ajout du bouton à notre content pane
		// pan.add(bouton);
		// this.setContentPane(pan);

		// On ajoute le bouton au content pane de la JFrame
		// this.getContentPane().add(bouton);

		/*
		 * // On définit le layout à utiliser sur le content pane this.setLayout(new
		 * BorderLayout()); // On ajoute le bouton au content pane de la JFrame // Au
		 * centre this.getContentPane().add(new JButton("CENTER"), BorderLayout.CENTER);
		 * // Au nord this.getContentPane().add(new JButton("NORTH"),
		 * BorderLayout.NORTH); // Au sud this.getContentPane().add(new
		 * JButton("SOUTH"), BorderLayout.SOUTH); // À l'ouest
		 * this.getContentPane().add(new JButton("WEST"), BorderLayout.WEST); // À l'est
		 * this.getContentPane().add(new JButton("EAST"), BorderLayout.EAST);
		 */

		/*
		 * // On définit le layout à utiliser sur le content pane // Trois lignes sur
		 * deux colonnes this.setLayout(new GridLayout(3, 2, 5, 5));
		 *
		 *
		 * // COmmande équivalente GridLayout gl = new GridLayout(); gl.setColumns(2);
		 * gl.setRows(3); gl.setHgap(5); //Cinq pixels d'espace entre les colonnes (H
		 * comme Horizontal) gl.setVgap(5); //Cinq pixels d'espace entre les lignes (V
		 * comme Vertical) this.setLayout(gl);
		 *
		 *
		 * // On ajoute le bouton au content pane de la JFrame
		 * this.getContentPane().add(new JButton("1")); this.getContentPane().add(new
		 * JButton("2")); this.getContentPane().add(new JButton("3"));
		 * this.getContentPane().add(new JButton("4")); this.getContentPane().add(new
		 * JButton("5"));
		 *
		 */

		/*
		 * JPanel b1 = new JPanel(); // On définit le layout en lui indiquant qu'il
		 * travaillera en ligne b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
		 * b1.add(new JButton("Bouton 1"));
		 *
		 * JPanel b2 = new JPanel(); // Idem pour cette ligne b2.setLayout(new
		 * BoxLayout(b2, BoxLayout.LINE_AXIS)); b2.add(new JButton("Bouton 2"));
		 * b2.add(new JButton("Bouton 3"));
		 *
		 * JPanel b3 = new JPanel(); // Idem pour cette ligne b3.setLayout(new
		 * BoxLayout(b3, BoxLayout.LINE_AXIS)); b3.add(new JButton("Bouton 4"));
		 * b3.add(new JButton("Bouton 5")); b3.add(new JButton("Bouton 6"));
		 *
		 * JPanel b4 = new JPanel(); // On positionne maintenant ces trois lignes en
		 * colonne b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS)); b4.add(b1);
		 * b4.add(b2); b4.add(b3);
		 *
		 * // On crée un conteneur avec gestion verticale // Box b4 =
		 * Box.createVerticalBox(); // b4.add(b1); // b4.add(b2); // b4.add(b3);
		 *
		 * this.getContentPane().add(b4);
		 */

		/*
		 * // On crée trois conteneurs de couleur différente JPanel card1 = new
		 * JPanel(); card1.setBackground(Color.blue); JPanel card2 = new JPanel();
		 * card2.setBackground(Color.red); JPanel card3 = new JPanel();
		 * card3.setBackground(Color.green);
		 *
		 * JPanel boutonPane = new JPanel(); JButton bouton = new
		 * JButton("Contenu suivant"); // Définition de l'action du bouton
		 * bouton.addActionListener(new ActionListener() {
		 *
		 * @Override public void actionPerformed(ActionEvent event) { // Via cette
		 * instruction, on passe au prochain conteneur de la pile cl.next(content); }
		 * });
		 *
		 * JButton bouton2 = new JButton("Contenu par indice"); // Définition de
		 * l'action du bouton2 bouton2.addActionListener(new ActionListener() {
		 *
		 * @Override public void actionPerformed(ActionEvent event) { if (++indice > 2)
		 * indice = 0; // Via cette instruction, on passe au conteneur correspondant au
		 * nom fourni en // paramètre cl.show(content, listContent[indice]); } });
		 *
		 * boutonPane.add(bouton); boutonPane.add(bouton2); // On définit le layout
		 * content.setLayout(cl); // On ajoute les cartes à la pile avec un nom pour les
		 * retrouver content.add(card1, listContent[0]); content.add(card2,
		 * listContent[1]); content.add(card3, listContent[2]);
		 *
		 * this.getContentPane().add(boutonPane, BorderLayout.NORTH);
		 * this.getContentPane().add(content, BorderLayout.CENTER);
		 */

		// On crée nos différents conteneurs de couleur différente
		JPanel cell1 = new JPanel();
		cell1.setBackground(Color.YELLOW);
		cell1.setPreferredSize(new Dimension(60, 40));
		JPanel cell2 = new JPanel();
		cell2.setBackground(Color.red);
		cell2.setPreferredSize(new Dimension(60, 40));
		JPanel cell3 = new JPanel();
		cell3.setBackground(Color.green);
		cell3.setPreferredSize(new Dimension(60, 40));
		JPanel cell4 = new JPanel();
		cell4.setBackground(Color.black);
		cell4.setPreferredSize(new Dimension(60, 40));
		JPanel cell5 = new JPanel();
		cell5.setBackground(Color.cyan);
		cell5.setPreferredSize(new Dimension(60, 40));
		JPanel cell6 = new JPanel();
		cell6.setBackground(Color.BLUE);
		cell6.setPreferredSize(new Dimension(60, 40));
		JPanel cell7 = new JPanel();
		cell7.setBackground(Color.orange);
		cell7.setPreferredSize(new Dimension(60, 40));
		JPanel cell8 = new JPanel();
		cell8.setBackground(Color.DARK_GRAY);
		cell8.setPreferredSize(new Dimension(60, 40));

		// Le conteneur principal
		JPanel content = new JPanel();
		content.setPreferredSize(new Dimension(300, 120));
		content.setBackground(Color.WHITE);
		// On définit le layout manager
		content.setLayout(new GridBagLayout());

		// L'objet servant à positionner les composants
		GridBagConstraints gbc = new GridBagConstraints();

		// On positionne la case de départ du composant
		gbc.gridx = 0;
		gbc.gridy = 0;
		// La taille en hauteur et en largeur
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		content.add(cell1, gbc);
		// ---------------------------------------------
		gbc.gridx = 1;
		content.add(cell2, gbc);
		// ---------------------------------------------
		gbc.gridx = 2;
		content.add(cell3, gbc);
		// ---------------------------------------------
		// Cette instruction informe le layout que c'est une fin de ligne
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridx = 3;
		content.add(cell4, gbc);
		// ---------------------------------------------
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		// Celle-ci indique que la cellule se réplique de façon verticale
		gbc.fill = GridBagConstraints.VERTICAL;
		content.add(cell5, gbc);
		// ---------------------------------------------
		gbc.gridx = 1;
		gbc.gridheight = 1;
		// Celle-ci indique que la cellule se réplique de façon horizontale
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		content.add(cell6, gbc);
		// ---------------------------------------------
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		content.add(cell7, gbc);
		// ---------------------------------------------
		gbc.gridx = 3;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		content.add(cell8, gbc);
		// ---------------------------------------------
		// On ajoute le conteneur
		this.setContentPane(content);

		this.setVisible(true);

	}

}
