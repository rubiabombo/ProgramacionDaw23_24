package capitulo5.bloque1.coleccionAntiguedades;

public class Libro extends Antiguedad{
	// Propiedades
		protected String autor;
		protected String titulo;

		// Constructor por defecto
		public Libro() {

		}

		// Constructor Superclase
		public Libro(int anyoFabricacion, String origen, float precioVenta, String autor, String titulo) {
			super(anyoFabricacion, origen, precioVenta);
			this.autor = autor;
			this.titulo = titulo;

		}

		@Override
		public String toString() {
			return "Libro [autor=" + autor + ", titulo=" + titulo + ", anyoFabricacion=" + anyoFabricacion + ", origen="
					+ origen + ", precioVenta=" + precioVenta + "]";
		}


}
