package capitulo5.bloque1.coleccionAntiguedades;

public class Antiguedad {
	 protected int anioFabricacion;
	    protected String origen;
	    protected double precioVenta;

	    public Antiguedad(int anioFabricacion, String origen, double precioVenta) {
	        this.anioFabricacion = anioFabricacion;
	        this.origen = origen;
	        this.precioVenta = precioVenta;
	    }

	    public String toString() {
	        return String.format("Año: %d, Origen: %s, Precio de venta: %.2f", anioFabricacion, origen, precioVenta);
	    }


}
