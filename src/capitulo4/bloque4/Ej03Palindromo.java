package capitulo4.bloque4;

import java.util.Scanner;

public class Ej03Palindromo {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa una cadena de caracteres: ");
	        String cadena = scanner.nextLine();

	        boolean esPalindromo = esPalindromo(cadena);

	        if (esPalindromo) {
	            System.out.println("La cadena es un palíndromo.");
	        } else {
	            System.out.println("La cadena no es un palíndromo.");
	        }
	    }

	    public static boolean esPalindromo(String cadena) {
	        // Eliminar espacios en blanco y convertir todo a minúsculas para evitar problemas de capitalización
	        cadena = cadena.replaceAll("\\s", "").toLowerCase();
	        
	        int longitud = cadena.length();
	        for (int i = 0; i < longitud / 2; i++) {
	            if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
	                return false;
	            }
	        }
	        return true;

	}

}
