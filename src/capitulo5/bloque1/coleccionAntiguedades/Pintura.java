package capitulo5.bloque1.coleccionAntiguedades;

public class Pintura extends Antiguedad {
	 private String pintor;
	    private String estilo;

	    public Pintura(int anioFabricacion, String origen, double precioVenta, String pintor, String estilo) {
	        super(anioFabricacion, origen, precioVenta);
	        this.pintor = pintor;
	        this.estilo = estilo;
	    }

	    public String toString() {
	        return super.toString() + String.format(", Pintor: %s, Estilo: %s", pintor, estilo);
	    }
}
