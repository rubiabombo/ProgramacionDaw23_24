package capitulo3.bloque4;

import java.util.Scanner;

public class Ejercicio01_NumeroPrimoOCompuestoSinFor {

	public static void main(String[] args) {
		int numUsuario, i;
		Scanner sc = new Scanner(System.in);
		boolean numeroTieneDivisores;
		
		System.out.println("Introduzca un número: ");
		numUsuario = sc.nextInt();
		
		i = 2;
		numeroTieneDivisores = false;
		
		while (i < numUsuario) {
			if (numUsuario % i == 0 ) {
				numeroTieneDivisores = true;
				break;
			}
			i++;
		}
		
		if (numeroTieneDivisores == true) {
			System.out.println("El número " + numUsuario + " es compuesto");	
		}
		else {
			System.out.println("El número " + numUsuario + " es primo");
		}

	}

}
