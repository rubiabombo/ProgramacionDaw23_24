package capitulo3.bloque5;

import java.util.Random;
import java.util.Scanner;

public class Ej04_JuegoAdivinanzaNumero {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        Random random = new Random();
	        
	        int numeroAleatorio = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
	        int intentos = 0;
	        boolean adivinado = false;
	        
	        System.out.println("Bienvenido al juego de adivinanza de números. Adivina el número entre 1 y 100.");
	        
	        while (!adivinado) {
	            System.out.print("Ingresa tu adivinanza: ");
	            int adivinanza = sc.nextInt();
	            intentos++;
	            
	            if (adivinanza == numeroAleatorio) {
	                adivinado = true;
	                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
	            } else if (adivinanza < numeroAleatorio) {
	                System.out.println("El número es mayor. Intenta de nuevo.");
	            } else {
	                System.out.println("El número es menor. Intenta de nuevo.");
	            }
	        }
	        
	        sc.close();
	}

}
