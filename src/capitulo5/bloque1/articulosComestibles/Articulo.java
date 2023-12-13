package capitulo5.bloque1.articulosComestibles;

public class Articulo {
	// Propiedades
	protected int codigo;
	protected String nombre;
	protected float precio;

	// Constructor por defecto
	public Articulo() {
		super();
	}

	// Constructor
	public Articulo(int condigo, String nombre, float precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	// Getters & Setters

	public int getCondigo() {
		return codigo;
	}

	public void setCondigo(int condigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
