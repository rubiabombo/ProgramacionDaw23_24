package arkanoid.version03;

import java.awt.Color;
import java.awt.Graphics;

public class Ladrillo extends Actor {
	public Color color;
	/**
	 * 
	 */
	public Ladrillo() {
		super();
	}
	
	/**
	 * 
	 * @param g
	 */
	public void paint(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.y, this.x, this.alto , this.ancho);
	};

	/**
	 * @param x
	 * @param y
	 * @param ancho
	 * @param alto
	 * @param img
	 */
	public Ladrillo(int x, int y, int ancho, int alto, String img, Color color) {
		super(x, y, ancho, alto, img);
		this.color = color;
	}
}