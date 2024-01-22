package arkanoid.version04;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import java.util.List;

public class MiCanvas extends Canvas {
	List<Actor> actrores = null;

	// BufferStrategy usado para conseguir la tecnica de doble búffer
	private BufferStrategy strategy = null;

	/**
	 * 
	 * @param actores
	 */
	public MiCanvas(List<Actor> actores) {
		super();
		this.actrores = actores;
	}

	public void pintaEscena() {
		// Tengo qur inicializar el objeto "strategy" una unica vez
		if (this.strategy == null) {
			// El Canvas dibujara en pantalla con una estrategia de doble búffer
			this.createBufferStrategy(2);
			// Obtengo una reeferencia a la estrategia de doble búffer
			strategy = getBufferStrategy();
			// Resuelve un problema de sincronizacion de memoria de video en Linux
			Toolkit.getDefaultToolkit().sync();
		}

		// Obtengo el objeto grafico que me permita pintar en ell doble Búffer
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
		// Pinto un rectángulos negro quer ocupe toda la escena
		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		// Pinto a cada uno de los actores
		for (Actor a : this.actrores) {
			a.paint(g);
		}

		// Muestro en pantalla el búffer con el nuevo frame crado para el juego
		strategy.show();
	}
}
