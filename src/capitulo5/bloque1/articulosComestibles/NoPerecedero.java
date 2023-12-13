package capitulo5.bloque1.articulosComestibles;

public class NoPerecedero extends Articulo {
	// Propiedades

	// Constructor por defecto
	public NoPerecedero() {

	}

	// Constructor
	public NoPerecedero(int codigo, String nombre, float precio) {
		super(codigo, nombre, precio);

	}
	
	@Override
	public String toString() {
		return "NoPerecedero [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

}
