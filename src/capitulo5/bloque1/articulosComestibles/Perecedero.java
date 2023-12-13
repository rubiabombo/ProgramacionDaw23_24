package capitulo5.bloque1.articulosComestibles;

public class Perecedero extends Articulo {
	// Propiedades
	protected String fechaCaducidad;

	// Constructor por defecto
	public Perecedero() {
		

	}

	// Constructor
	public Perecedero(int codigo, String nombre, float precio, String fechaCaducidad) {
		super(codigo, nombre, precio);
		this.fechaCaducidad = fechaCaducidad;

	}

	@Override
	public String toString() {
		return "Perecedero [fechaCaducidad=" + fechaCaducidad + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", precio=" + precio + "]";
	}

	

}
