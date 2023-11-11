package capitulo4.ejerciciosAmpliacion;

import java.util.Arrays;

public class Ej02Anagrama {

	public static boolean areAnagrams(String str1, String str2) {
		// Elimina los espacios en blanco y convierte ambas cadenas a minúsculas para
		// una comparación insensible a mayúsculas/minúsculas.
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		// Verifica si las longitudes de las cadenas son diferentes.
		if (str1.length() != str2.length()) {
			return false;
		}

		// Convierte ambas cadenas en arreglos de caracteres y ordénalos.
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Compara los arreglos ordenados para determinar si son anagramas.
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		String cadena1 = "listen";
		String cadena2 = "silent";

		if (areAnagrams(cadena1, cadena2)) {
			System.out.println(cadena1 + " y " + cadena2 + " son anagramas.");
		} else {
			System.out.println(cadena1 + " y " + cadena2 + " no son anagramas.");
		}
	}

}

