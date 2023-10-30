package capitulo4.bloque4;

import java.util.Scanner;

public class Ej02ContarVocalesConsonantes {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Ingresa una cadena de caracteres: ");
	        String input = sc.nextLine();
	        sc.close();

	        int[] resultado = contarVocalesYConsonantes(input);

	        System.out.println("Vocales: " + resultado[0]);
	        System.out.println("Consonantes: " + resultado[1]);
	    }

	    public static int[] contarVocalesYConsonantes(String input) {
	        input = input.toLowerCase();  // Convertir a minúsculas para hacer las comparaciones más sencillas
	        int vocales = 0;
	        int consonantes = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char caracter = input.charAt(i);

	            if (caracter >= 'a' && caracter <= 'z') {
	                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
	                    vocales++;
	                } else {
	                    consonantes++;
	                }
	            }
	        }

	        int[] resultado = {vocales, consonantes};
	        return resultado;

	}

}
