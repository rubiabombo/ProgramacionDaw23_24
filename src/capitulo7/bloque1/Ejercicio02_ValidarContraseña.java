package capitulo7.bloque1;

import java.util.Scanner;

public class Ejercicio02_ValidarContraseña {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        
	        while (true) {
	            System.out.println("Introduce tu contraseña:");
	            String contrasena = sc.nextLine();
	            
	            if (verificarContrasena(contrasena)) {
	                System.out.println("¡Contraseña válida! ¡Acceso permitido!");
	                break;
	            } else {
	                System.out.println("La contraseña no cumple con los requisitos. Inténtalo de nuevo.");
	            }
	        }

	        sc.close();
	    }

	    private static boolean verificarContrasena(String contrasena) {
	        // Verificar al menos una mayúscula
	        if (!tieneMayuscula(contrasena)) {
	            return false;
	        }

	        // Verificar al menos una minúscula
	        if (!tieneMinuscula(contrasena)) {
	            return false;
	        }

	        // Verificar al menos un dígito
	        if (!tieneDigito(contrasena)) {
	            return false;
	        }

	        // Verificar al menos un carácter no alfanumérico
	        if (!tieneCaracterEspecial(contrasena)) {
	            return false;
	        }

	        // Si se cumplen todos los requisitos, la contraseña es válida
	        return true;
	    }

	    private static boolean tieneMayuscula(String contrasena) {
	        return contrasena.matches(".*[A-Z].*");
	    }

	    private static boolean tieneMinuscula(String contrasena) {
	        return contrasena.matches(".*[a-z].*");
	    }

	    private static boolean tieneDigito(String contrasena) {
	        return contrasena.matches(".*\\d.*");
	    }

	    private static boolean tieneCaracterEspecial(String contrasena) {
	        return contrasena.matches(".*[^a-zA-Z0-9].*");
	    }
	}
