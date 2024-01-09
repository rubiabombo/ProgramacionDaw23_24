package arkanoid.version01;

import java.awt.Graphics;

//Método abstracto. 
	public abstract class Actor {

		// Creamos las propiedades
		protected int x, y; // Coordenadas x e y del actor
		protected int ancho, alto; // ancho y alto que ocupa el actor en pantalla
		
		
		//Constructor por defecto

		public Actor() {
			super();
		}

		//Constructor 

		public Actor(int x, int y, int ancho, int alto) {
			super();
			this.x = x;
			this.y = y;
			this.ancho = ancho;
			this.alto = alto;
		}
		
		

		//Métoodo abstracto para que todos los hijos de actor se implementen
		public abstract void paint (Graphics g);
		
		/**
		 * Método que permite que cada actor realice las acciones que necesite en la creación de cada Frame
		 */
		public abstract void actua ();

		@Override
		public String toString() {
			return "Actor [x=" + x + ", y=" + y + ", ancho=" + ancho + ", alto=" + alto + "]";
		}

		
		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getAncho() {
			return ancho;
		}

		public void setAncho(int ancho) {
			this.ancho = ancho;
		}

		public int getAlto() {
			return alto;
		}

		public void setAlto(int alto) {
			this.alto = alto;
		}

		
		
		
		
		
	}