package capitulo3.bloque4;

import java.util.Scanner;

public class Ejercicio05_FactorialSinUsarBucleFor {

	public static void main(String[] args) {
		int num, i, factorial = 1;
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Introduzca un número y calcularé su factorial: ");
		num = sc.nextInt();
		
		factorial = num;
		i = num -1;
		while (i > 1) {
			factorial *= i;
			i--;
		}
		System.out.println("Factorial de " + num + " es: " + factorial);

	}

}
