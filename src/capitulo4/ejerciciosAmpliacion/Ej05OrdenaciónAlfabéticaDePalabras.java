package capitulo4.ejerciciosAmpliacion;

public class Ej05OrdenaciónAlfabéticaDePalabras {

	public static void main(String[] args) {
		  String oracion = "Esta es una oración de ejemplo";
	        String[] palabras = oracion.split(" "); // Dividimos la oración en palabras

	        // Ordenamos las palabras en orden alfabético
	        for (int i = 0; i < palabras.length; i++) {
	            for (int j = i + 1; j < palabras.length; j++) {
	                if (palabras[i].compareTo(palabras[j]) > 0) {
	                    // Intercambiamos las palabras si están fuera de orden
	                    String temp = palabras[i];
	                    palabras[i] = palabras[j];
	                    palabras[j] = temp;
	                }
	            }
	        }

	        // Imprimimos las palabras ordenadas
	        for (String palabra : palabras) {
	            System.out.print(palabra + " ");
	        }

	}

}
