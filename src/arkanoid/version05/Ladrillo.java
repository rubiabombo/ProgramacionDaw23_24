package arkanoid.version05;

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
		g.fillRect(this.x, this.y, this.ancho , this.alto);
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

	/**
	 * Se disparara cuando un actor colisione con el ladrillo
	 */
	public void colisionaCon(Actor a) {
		super.colisionaCon(a);

		// Si colisionamos con un player, eliminamos el ladrillo
		if (a instanceof Pelota) {
			Arkanoid.getInstance().eliminaActor(this);
			Arkanoid.getInstance().incorporaNuevoActor(new Explosion(this.x, this.y));
		}
	}
}
