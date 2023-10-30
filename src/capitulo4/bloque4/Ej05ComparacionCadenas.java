package capitulo4.bloque4;

import java.util.Scanner;

public class Ej05ComparacionCadenas {

	public static void main(String[] args) {
		   // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Lee las dos cadenas de caracteres del usuario
        System.out.print("Introduce la primera cadena: ");
        String string1 = scanner.nextLine();
        System.out.print("Introduce la segunda cadena: ");
        String string2 = scanner.nextLine();

        // Llama al método para comparar las cadenas y muestra el resultado
        int resultado = compararCadenas(string1, string2);

        if (resultado < 0) {
            System.out.println("El string 1 es menor que string 2.");
        } else if (resultado > 0) {
            System.out.println("El string 1 es mayor que string 2.");
        } else {
            System.out.println("Ambas cadenas son iguales.");
        }

        // Cierra el objeto Scanner
        scanner.close();
    }

    public static int compararCadenas(String string1, String string2) {
        // Convierte ambas cadenas a minúsculas y elimina vocales con tilde y 'ñ'
        string1 = string1.toLowerCase().replaceAll("[áéíóúüñ]", "aeiouun");
        string2 = string2.toLowerCase().replaceAll("[áéíóúüñ]", "aeiouun");

        // Realiza la comparación lexicográfica y devuelve el resultado
        return string1.compareTo(string2);

	}

}
