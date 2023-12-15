package capitulo5.bloque1.articulosComestibles;

public class Perecedero extends Articulo {
	
	  protected String fechaCaducidad;

	    public Perecedero(int codigo, String nombre, double precio, String fechaCaducidad) {
	        super(codigo, nombre, precio);
	        this.fechaCaducidad = fechaCaducidad;
	    }

	    @Override
	    public void mostrarInformacion() {
	        super.mostrarInformacion();
	        System.out.println("Fecha de caducidad: " + fechaCaducidad);
	    }
	}

	

