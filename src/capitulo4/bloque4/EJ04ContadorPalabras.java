package capitulo4.bloque4;

import java.util.Scanner;

public class EJ04ContadorPalabras {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa una cadena de caracteres: ");
		String input = scanner.nextLine();

		int numeroDePalabras = contarPalabras(input);

		System.out.println("El número de palabras en la cadena es: " + numeroDePalabras);

		scanner.close();
	}

	public static int contarPalabras(String cadena) {
		String[] palabras = cadena.trim().split("\\s+");
		// La expresión regular "\\s+" divide la cadena en palabras, considerando
		// cualquier cantidad de espacios en blanco como separadores.
		return palabras.length;

	}

}
