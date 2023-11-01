package capitulo4.bloque5;

public class Ej05_InvertirPalabras {

	public static String invertirPalabras(String cadena) {
		String[] palabras = cadena.split(" "); // Dividir la cadena en palabras usando el espacio como separador
		StringBuilder resultado = new StringBuilder();

		for (String palabra : palabras) {
			StringBuilder palabraInvertida = new StringBuilder(palabra);
			palabraInvertida.reverse(); // Invertir la palabra
			resultado.append(palabraInvertida).append(" ");
		}

		// Eliminar el espacio adicional al final y devolver la cadena resultante
		return resultado.toString().trim();
	}

	public static void main(String[] args) {
		String cadenaOriginal = "Hola Mundo";
		String cadenaInvertida = invertirPalabras(cadenaOriginal);
		System.out.println("Cadena original: " + cadenaOriginal);
		System.out.println("Cadena invertida: " + cadenaInvertida);

	}

}
