package arkanoid.version01;

import java.awt.Color;
import java.awt.Graphics;

public class Nave extends Actor{

	//Constructor por defecto.
	public Nave() {
		super();
	}
	
	//Constructor
	public Nave(int x, int y, int ancho, int alto) {
		super(x, y, ancho, alto);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(this.x,this.y,this.ancho, this.alto);
	}

	@Override
	public void actua() {
		
	}

}