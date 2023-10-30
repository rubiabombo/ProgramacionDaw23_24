package capitulo4.bloque4;

import java.util.Scanner;

public class Ej06ConvertirMayusculasAMinusculas {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingresa una cadena de caracteres: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        String resultado = convertirMayusculasAMinusculas(input);
	        System.out.println("Resultado: " + resultado);
	    }

	    public static String convertirMayusculasAMinusculas(String input) {
	        StringBuilder resultado = new StringBuilder();

	        for (int i = 0; i < input.length(); i++) {
	            char caracter = input.charAt(i);

	            // Verifica si el caracter es una letra mayúscula y no es una vocal con tilde ni la letra 'ñ'.
	            if (Character.isUpperCase(caracter) && !esVocalConTildeOÑ(caracter)) {
	                // Convierte el caracter a minúscula.
	                caracter = Character.toLowerCase(caracter);
	            }

	            resultado.append(caracter);
	        }

	        return resultado.toString();
	    }

	    public static boolean esVocalConTildeOÑ(char c) {
	        // Verifica si el caracter es una vocal con tilde o la letra 'ñ'.
	        return "ÁÉÍÓÚáéíóúÜüÑñ".indexOf(c) != -1;

	}

}
