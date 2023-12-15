package capitulo5.bloque1.articulosComestibles;

public class Articulo {
	 protected int codigo;
	    protected String nombre;
	    protected double precio;

	    public Articulo(int codigo, String nombre, double precio) {
	        this.codigo = codigo;
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    public void mostrarInformacion() {
	        System.out.println("Código: " + codigo);
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Precio: $" + precio);
	    }
	}


