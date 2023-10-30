package capitulo4.bloque4;

import java.util.Scanner;



public class Ej01InvertirCadena {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa una cadena de caracteres: ");
		String inputString = scanner.nextLine();

		String reversedString = reverseString(inputString);

		System.out.println("Cadena en orden inverso: " + reversedString);

		scanner.close();
	}

	public static String reverseString(String input) {
		StringBuilder reversed = new StringBuilder();

		for (int i = input.length() - 1; i >= 0; i--) {
			reversed.append(input.charAt(i));
		}

		return reversed.toString();
	}
}
