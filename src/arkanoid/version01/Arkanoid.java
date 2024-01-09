package arkanoid.version01;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;

public class Arkanoid {

	private static int FPS = 60;
	private static JFrame ventana = null;
	private static List<Actor> actores = new ArrayList<Actor>();
	private static MiCanvas canvas = null;

	// Para utilizar un patrón singleton necesitamos la siguiente propiedad estática
	private static Arkanoid instance = null;

	/**
	 * Este método representa la principal funcionalidad de un patrón Singleton.
	 * Devuelve la única instancia que puede existir del esta clase. Si no se ha
	 * inicializado, en la primera llamada a este método se realiza dicha
	 * inicialización.
	 */
	public static Arkanoid getInstance() {
		if (instance == null) { // Si no está inicializada, se inicializa
			instance = new Arkanoid();
		}
		return instance;
	}

	public Arkanoid() {

		ventana = new JFrame("Arkanoid");
		ventana.setBounds(0, 0, 500, 700);

		// Para colocar objetos sobre la ventana debo asignale un "layou" (plantilla) al
		// panel principal de la ventana. (Como poner el lienzo)
		ventana.getContentPane().setLayout(new BorderLayout());

		// Creo una lista de actores que intervendrá en el juego.
		actores = creaActores();

		// Creo y agrego un canvas, es un objeto que permitirá dibujar sobre él
		canvas = new MiCanvas(actores);
		ventana.getContentPane().add(canvas, BorderLayout.CENTER);
		// Consigo que la ventana no se redibuje por los eventos de Windows
		ventana.setIgnoreRepaint(true);
		// Hago que la ventana sea visible
		ventana.setVisible(true);

	}

	public static void main(String[] args) {

		// Comienzo un bucle, que consistirá en el juego completo.
		//Método que llama a la instancia y al método juego. 
		Arkanoid.getInstance().juego();
	}


	/**
	 * Bucle del juego principal
	 */
	public void juego () {
		int millisPorCadaFrame = 1000 / FPS;
		do {
			// Redibujo la escena tantas veces por segundo como indique la variable FPS
			// Tomo los millis actuales
			long millisAntesDeProcesarEscena = new Date().getTime();
			
			// Redibujo la escena
			canvas.repaint();
			
			// Recorro todos los actores, consiguiendo que cada uno de ellos actúe
			for (Actor a : actores) {
				a.actua();
			}
			
			// Calculo los millis que debemos parar el proceso, generando 60 FPS.
			long millisDespuesDeProcesarEscena = new Date().getTime();
			int millisDeProcesamientoDeEscena = (int) (millisDespuesDeProcesarEscena - millisAntesDeProcesarEscena);
			int millisPausa = millisPorCadaFrame - millisDeProcesamientoDeEscena;
			millisPausa = (millisPausa < 0)? 0 : millisPausa;
			// "Duermo" el proceso principal durante los milllis calculados.
			try {
				Thread.sleep(millisPausa);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (true);
	}
	

	/**
	 * 
	 *
	 * @return
	 */
	private static List<Actor> creaActores() {
		List<Actor> actores = new ArrayList<Actor>();

		// Construyo un player para este juego y lo agrego a la lista.
		Nave nave1 = new Nave(200, 500, 60, 30);
		actores.add(nave1);

		// Construyo un player para este juego y lo agrego a la lista
		Ladrillo ladrillo1 = new Ladrillo(30, 30, 20, 10);
		actores.add(ladrillo1);

		Pelota pelota1 = new Pelota(50, 50, 30, 30);
		actores.add(pelota1);

		// Devuelvo la lista con todos los actores del juego
		return actores;
	}

	/**
	 * @return the canvas
	 */
	public MiCanvas getCanvas() {
		return canvas;
	}

}
