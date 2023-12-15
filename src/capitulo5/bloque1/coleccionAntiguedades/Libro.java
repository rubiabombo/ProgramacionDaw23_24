package capitulo5.bloque1.coleccionAntiguedades;

public class Libro extends Antiguedad{
	 private String autor;
	    private String titulo;

	    public Libro(int anioFabricacion, String origen, double precioVenta, String autor, String titulo) {
	        super(anioFabricacion, origen, precioVenta);
	        this.autor = autor;
	        this.titulo = titulo;
	    }

	    public String toString() {
	        return super.toString() + String.format(", Autor: %s, Título: %s", autor, titulo);
	    }
}
