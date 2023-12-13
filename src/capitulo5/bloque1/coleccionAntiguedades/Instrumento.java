package capitulo5.bloque1.coleccionAntiguedades;

public class Instrumento extends Antiguedad{
	// Propiedades
		protected String instrumento;
		protected String familia;

		// Constructor por Defecto
		public Instrumento() {

		}

		// Constructor Superclase
		public Instrumento(int anyoFabricacion, String origen, float precioVenta, String instrumento, String familia) {
			super(anyoFabricacion, origen, precioVenta);
			this.instrumento = instrumento;
			this.familia = familia;

		}

		@Override
		public String toString() {
			return "Instrumento [instrumento=" + instrumento + ", familia=" + familia + ", anyoFabricacion="
					+ anyoFabricacion + ", origen=" + origen + ", precioVenta=" + precioVenta + "]";
		}


}
