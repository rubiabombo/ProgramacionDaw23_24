package capitulo4.ejerciciosAmpliacion;

import java.util.Scanner;

public class Ej03ReemplazoDeSubcadenas {

	
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Solicita la cadena original
		        System.out.print("Ingresa la cadena original: ");
		        String cadenaOriginal = sc.nextLine();

		        // Solicita la subcadena a buscar
		        System.out.print("Ingresa la subcadena a reemplazar: ");
		        String subcadena = sc.nextLine();

		        // Solicita la cadena de reemplazo
		        System.out.print("Ingresa la cadena de reemplazo: ");
		        String cadenaReemplazo = sc.nextLine();

		        // Realiza el reemplazo
		        String nuevaCadena = reemplazarSubcadena(cadenaOriginal, subcadena, cadenaReemplazo);

		        // Muestra la nueva cadena
		        System.out.println("Nueva cadena: " + nuevaCadena);
		    }

		    public static String reemplazarSubcadena(String cadenaOriginal, String subcadena, String cadenaReemplazo) {
		        // Utiliza el método replaceAll para reemplazar todas las ocurrencias de la subcadena
		        String nuevaCadena = cadenaOriginal.replaceAll(subcadena, cadenaReemplazo);
		        return nuevaCadena;
		    }
		


	}


