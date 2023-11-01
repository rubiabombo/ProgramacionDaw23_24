package capitulo4.bloque5;

import java.util.HashSet;
import java.util.Set;

public class Ej06_Panagrama {

	public static void main(String[] args) {
		  String cadena = "Esta es una cadena de ejemplo que contiene algunas palabras pangrama.";
	        int cantidadPangramas = contarPangramasEnCadena(cadena);
	        System.out.println("Cantidad de palabras pangrama: " + cantidadPangramas);
	    }

	    public static int contarPangramasEnCadena(String cadena) {
	        String[] palabras = cadena.split("\\s+"); // Dividir la cadena en palabras
	        int contadorPangramas = 0;

	        for (String palabra : palabras) {
	            if (esPangrama(palabra)) {
	                contadorPangramas++;
	            }
	        }

	        return contadorPangramas;
	    }

	    public static boolean esPangrama(String palabra) {
	        Set<Character> letras = new HashSet<>();

	        for (char c : palabra.toCharArray()) {
	            if (Character.isLetter(c)) {
	                letras.add(Character.toLowerCase(c));
	            }
	        }

	        return letras.size() == 26; // 26 letras en el alfabeto inglés

	}

}
