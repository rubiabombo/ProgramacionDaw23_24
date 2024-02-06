package arkanoid.version05;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import java.util.List;

public class MiCanvas extends Canvas {
	
	List<Actor> actores = null;
	
	// BufferStrategy usado para conseguir la t�cnica de doble b�ffer
	private BufferStrategy strategy = null;

	
	/**
	 * @param actores
	 */
	public MiCanvas(List<Actor> actores) {
		super();
		this.actores = actores;
	}


	public void pintaEscena () {
		// Tengo que inicializar el objeto "strategy" una unica vez
		if (this.strategy == null) {
			// El Canvas se dibujar� en pantalla con una estrategia de doble búffer
			this.createBufferStrategy(2);
			// Obtengo una referencia a la estrategia de doble b�ffer.
			strategy = getBufferStrategy();
			// Resuelve un problema de sincronizaci�n de memoria de video en Linux
			Toolkit.getDefaultToolkit().sync();			
		}
		// Obtengo el objeto gráfico que me permita pintar en el doble búffer
		Graphics2D g = (Graphics2D)strategy.getDrawGraphics();
		// Pinto un rect�ngulo negro que ocupe toda la escena
		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		// Pinto cada uno de los actores
		for (Actor a : this.actores) {
			a.paint(g);
		}

		// Muestro en pantalla el buffer con el nuevo frame creado para el juego
		strategy.show();

	}

}
