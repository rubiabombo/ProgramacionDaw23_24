package arkanoid.version01;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class MiCanvas extends Canvas {

	/**
	 * Clase que sobrescribe un objeto de tipo Canvas. Lo utilizaremos para poder
	 * pintar sobre él todo lo que queramos.
	 * 
	 * @author Usuario
	 *
	 */

	List<Actor> actores = null;

	/**
	 * Constructor
	 * 
	 * @param actores
	 */
	public MiCanvas(List<Actor> actores) {
		this.actores = actores;
	}

	/**
	 * Sobrescritura del méotod paint(), aquí tengo el control sobre aquello que se
	 * va a pintar en pantalla.
	 */
	@Override
	public void paint(Graphics g) {
		// Pinto el fondo
		this.setBackground(Color.BLACK);

		// Pinto cada uno de los actores
		for (Actor a : this.actores) {
			a.paint(g);
		}
	}

}
