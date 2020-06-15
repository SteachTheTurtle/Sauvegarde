package com.steachtheturtle.ihm.formulaire;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Fenetre extends JFrame {

	// La classe interne ItemState reste inchangée
	class ItemAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ActionListener : Action sur " + combo.getSelectedItem());
		}
	}

	// Classe interne implémentant l'interface ItemListener
	class ItemState implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			System.out.println("Evénement déclenché sur : " + e.getItem());
		}
	}

	class StateCheckListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("source : " + ((JRadioButton) e.getSource()).getText() + " - état : "
					+ ((JRadioButton) e.getSource()).isSelected());
		}
	}

	class StateListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Source : " + ((JCheckBox) e.getSource()).getText() + " - Etat : "
					+ ((JCheckBox) e.getSource()).isSelected());
		}
	}

	// String[] tab = {"Option 1", "Option 2", "Option 3", "Option 4"};
	// combo = new JComboBox(tab);

	private JPanel container = new JPanel();

	private JComboBox combo = new JComboBox();

	private JLabel label = new JLabel("ComboBox et CheckBox ");
	private JCheckBox check1 = new JCheckBox("Case 1");
	private JCheckBox check2 = new JCheckBox("Case 2");

	private ButtonGroup bg = new ButtonGroup();
	private JRadioButton jr1 = new JRadioButton("Radio 1");
	private JRadioButton jr2 = new JRadioButton("Radio 2");

	public Fenetre() {

		this.setTitle("Animation");
		this.setSize(900, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		combo.setPreferredSize(new Dimension(100, 20));

		combo.addItem("Option 1");
		combo.addItem("Option 2");
		combo.addItem("Option 3");
		combo.addItem("Option 4");

		// Ajout du Itemlistener
		combo.addItemListener(new ItemState());
		// Ajout d'un action listener (pour la démonstration)
		combo.addActionListener(new ItemAction());
		check1.addActionListener(new StateListener());
		check2.addActionListener(new StateListener());
		jr1.addActionListener(new StateCheckListener());
		jr2.addActionListener(new StateCheckListener());

		combo.setForeground(Color.blue);

		JPanel top = new JPanel();

		top.add(label);
		top.add(combo);
		top.add(check1);
		top.add(check2);

		jr1.setSelected(true);
		bg.add(jr1);
		bg.add(jr2);
		top.add(jr1);
		top.add(jr2);

		container.add(top, BorderLayout.NORTH);

		this.setContentPane(container);
		this.setVisible(true);

	}

}
