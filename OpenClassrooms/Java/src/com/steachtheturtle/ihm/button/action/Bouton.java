package com.steachtheturtle.ihm.button.action;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Bouton extends JButton implements MouseListener {

	/*
	 * private String name;
	 *
	 * public Bouton(String str) { super(str); this.name = str; }
	 */

	private String name;
	private Image img;

	public Bouton(String str) {
		super(str);
		this.name = str;
		try {
			img = ImageIO.read(new File(
					"/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/ihm/button/action/Image.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Bug!!");
		}
		// Grâce à cette instruction, notre objet va s'écouter
		// Dès qu'un événement de la souris sera intercepté, il en sera averti
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent event) {
		if ((event.getY() > 0 && event.getY() < this.getHeight())
				&& (event.getX() > 0 && event.getX() < this.getWidth())) {

			System.out.println("Marche");

		}

	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 20, Color.cyan, true);
		g2d.setPaint(gp);

		g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		g2d.setColor(Color.black);

		// g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		// g2d.setColor(Color.white);

		// Objet permettant de connaître les propriétés d'une police, dont la taille
		FontMetrics fm = g2d.getFontMetrics();
		// Hauteur de la police d'écriture
		int height = fm.getHeight();
		// Largeur totale de la chaîne passée en paramètre
		int width = fm.stringWidth(this.name);

		// On calcule alors la position du texte, et le tour est joué
		g2d.drawString(this.name, this.getWidth() / 2 - (width / 2), (this.getHeight() / 2) + (height / 4));

		// g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth() / 2 / 4),
		// (this.getHeight() / 2) + 5);
	}
}
