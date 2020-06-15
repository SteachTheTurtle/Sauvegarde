package com.steachtheturtle.ihm.formulaire;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//Les imports habituels
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class FenetreEvolution2 extends JFrame {

	class BoutonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("TEXT : jtf1 " + jtf.getText());
			System.out.println("TEXT : jtf2 " + jtf2.getText());
			System.out.println("TEXT : jtf3 " + jtf3.getText());
		}
	}

	private JPanel container = new JPanel();
	private JLabel label = new JLabel("Un JTextField");
	private JTextField jtf = new JTextField("Valeur par défaut");
	private JFormattedTextField jtf2 = new JFormattedTextField(NumberFormat.getIntegerInstance());
	private JFormattedTextField jtf3 = new JFormattedTextField(NumberFormat.getPercentInstance());

	private JButton b = new JButton("OK");

	public FenetreEvolution2() {

		this.setTitle("Animation");
		this.setSize(900, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());

		JPanel top = new JPanel();

		Font police = new Font("Arial", Font.BOLD, 14);

		jtf.setFont(police);
		jtf.setPreferredSize(new Dimension(150, 30));
		jtf.setForeground(Color.BLUE);

		jtf2.setFont(police);
		jtf2.setPreferredSize(new Dimension(150, 30));
		jtf2.setForeground(Color.BLUE);

		jtf3.setFont(police);
		jtf3.setPreferredSize(new Dimension(150, 30));
		jtf3.setForeground(Color.RED);

		b.addActionListener(new BoutonListener());

		top.add(label);
		top.add(jtf);
		top.add(jtf2);
		top.add(jtf3);

		try {
			MaskFormatter tel = new MaskFormatter("## ## ## ## ##");
			// Ou encore
			// MaskFormatter tel2 = new MaskFormatter("##-##-##-##-##");

			// Vous pouvez ensuite le passer à votre zone de texte
			JFormattedTextField jtf4 = new JFormattedTextField(tel);

			jtf4.setFont(police);
			jtf4.setPreferredSize(new Dimension(150, 30));
			jtf4.setForeground(Color.GREEN);

			top.add(jtf4);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		top.add(b);

		container.add(top, BorderLayout.NORTH);

		this.setContentPane(container);
		this.setVisible(true);
	}
}
