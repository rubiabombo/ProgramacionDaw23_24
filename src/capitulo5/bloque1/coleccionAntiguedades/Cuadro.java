package capitulo5.bloque1.coleccionAntiguedades;

public class Cuadro extends Antiguedad {
	// Propiedades
	String titulo;
	String pintor;

	// Constructor por Defecto
	public Cuadro() {

	}

	// Constructor de Superclase
	public Cuadro(int anyoFabricacion, String origen, float precioVenta, String titulo, String pintor) {
		super(anyoFabricacion, origen, precioVenta);
		this.titulo = titulo;
		this.pintor = pintor;
	}

	@Override
	public String toString() {
		return "Cuadro [titulo=" + titulo + ", pintor=" + pintor + ", anyoFabricacion=" + anyoFabricacion + ", origen="
				+ origen + ", precioVenta=" + precioVenta + "]";
	}

}
