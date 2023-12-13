package capitulo5.bloque1.coleccionAntiguedades;

public class Antiguedad {
	// Propiedades
	protected int anyoFabricacion;
	protected String origen;
	protected float precioVenta;

	public Antiguedad() {
		super();
	}

	public Antiguedad(int anyoFabricacion, String origen, float precioVenta) {
		super();
		this.anyoFabricacion = anyoFabricacion;
		this.origen = origen;
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return "Antiguedad [anyoFabricacion=" + anyoFabricacion + ", origen=" + origen + ", precioVenta=" + precioVenta
				+ "]";
	}

	// Getters & Setters

	public int getAnyoFabricacion() {
		return anyoFabricacion;
	}

	public void setAnyoFabricacion(int anyoFabricacion) {
		this.anyoFabricacion = anyoFabricacion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}


}
