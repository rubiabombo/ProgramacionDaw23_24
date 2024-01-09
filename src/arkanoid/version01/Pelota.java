package arkanoid.version01;

import java.awt.Color;
import java.awt.Graphics;

public class Pelota extends Actor {
	// Creamos las propiedades de la pelota
	protected int x = -5;
	protected int y = -5;
	protected int ancho = 50;
	protected int alto = 50;
	protected int velocidadX = -5;
	protected int velocidadY = -5;

	// Constructo por defecto
	public Pelota() {
		super();
	}

	// Constructor

	public Pelota(int x, int y, int ancho, int alto) {
		super();
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
	}

	// Hereda método abstracto del padre (actor).
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(this.x, this.y, this.ancho, this.alto);
	}

	

	@Override
	public void actua() {
		// La pelota se mueve de manera horizontal, en cada FPS
		this.x += this.velocidadX;
		// Si el monstruo abandona la escena por la izquierda o la derecha, rebota
		if (this.x < 0 || (this.x + this.ancho) > Arkanoid.getInstance().getCanvas().getWidth()) {
			this.velocidadX = -this.velocidadX;
		}
		
		// Copiamos el esquema anterior para el movimiento vertical
		this.y += this.velocidadY;
		// Si el monstruo abandona la escena por la izquierda o la derecha, rebota
		if (this.y < 0 || (this.y + this.alto) > Arkanoid.getInstance().getCanvas().getHeight()) {
			this.velocidadY = -this.velocidadY;
		}
		
	}

}
