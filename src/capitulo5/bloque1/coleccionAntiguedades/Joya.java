package capitulo5.bloque1.coleccionAntiguedades;

public class Joya extends Antiguedad{
	// Propiedades
		protected String materialFabricacion;
		
		// Constructor por Defecto
		public Joya() {
			
		}

		// Constructor SuperClase
		public Joya(int anyoFabricacion, String origen, float precioVenta, String materialFabricacion) {
			super(anyoFabricacion, origen, precioVenta);
			this.materialFabricacion = materialFabricacion;

		}

		@Override
		public String toString() {
			return "Joya [materialFabricacion=" + materialFabricacion + ", anyoFabricacion=" + anyoFabricacion + ", origen="
					+ origen + ", precioVenta=" + precioVenta + "]";
		}

	}

