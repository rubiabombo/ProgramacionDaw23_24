package capitulo5.bloque1.coleccionAntiguedades;

public class Joya extends Antiguedad{
	 private String materialFabricacion;

	    public Joya(int anioFabricacion, String origen, double precioVenta, String materialFabricacion) {
	        super(anioFabricacion, origen, precioVenta);
	        this.materialFabricacion = materialFabricacion;
	    }

	    public String toString() {
	        return super.toString() + String.format(", Material: %s", materialFabricacion);
	    }
	}

