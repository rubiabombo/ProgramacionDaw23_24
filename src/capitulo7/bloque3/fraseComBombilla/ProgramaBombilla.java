package capitulo7.bloque3.fraseComBombilla;

import java.util.Scanner;

public class ProgramaBombilla {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try {
            // Pedir al usuario una frase
            System.out.println("Introduce una frase que contenga la palabra \"bombilla\":");
            String frase = sc.nextLine();

            // Verificar si la frase tiene caracteres distintos al espacio en blanco
            if (frase.trim().isEmpty()) {
                throw new Exception("La frase no tiene caracteres distintos al espacio en blanco.");
            }

            // Dividir la frase en palabras
            String[] palabras = frase.split("\\s+");

            // Verificar si la cantidad de palabras es inferior a 3
            if (palabras.length < 3) {
                throw new Exception("La cantidad de palabras en la frase es inferior a 3.");
            }

            // Verificar si la palabra "bombilla" está presente en la frase
            boolean contieneBombilla = false;
            for (String palabra : palabras) {
                if (palabra.equalsIgnoreCase("bombilla")) {
                    contieneBombilla = true;
                    break;
                }
            }

            if (!contieneBombilla) {
                throw new Exception("En la frase no aparece la palabra \"bombilla\".");
            }

            // Verificar si la frase contiene palabras ofensivas
            for (String palabra : palabras) {
                if (palabra.equalsIgnoreCase("tonto") || palabra.equalsIgnoreCase("tonta") || palabra.equalsIgnoreCase("idiota")) {
                    throw new PalabraOfensivaException("La frase contiene una palabra ofensiva: " + palabra);
                }
            }

            // Si todas las verificaciones pasan, imprimir la frase
            System.out.println("Frase válida: " + frase);

        } catch (Exception e) {
            // Manejar excepciones generales
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Cerrar el scanner
            sc.close();
        }
    }
}

