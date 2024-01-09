package arkanoid.version01;

import java.awt.Color;
import java.awt.Graphics;

public class Ladrillo extends Actor {

	private int ancho = 60;
	private int alto = 30;
	
	//Creamos constructor por defecto
	public Ladrillo() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Creamos constructor con las propiedades de la superclase que es Actor
	public Ladrillo(int x, int y, int ancho, int alto) {
		super(x, y, ancho, alto);
	}

	//Pintamos el ladrillo
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(this.x, this.y, this.ancho, this.alto);
		
	}

	@Override
	public void actua() {
		
	}
	
	

}

