package capitulo2.bloque1;

import java.util.Scanner;

public class Ejercicio02_MenorDeDosNumerosIntroducidos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Introduce el número 1: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce el número 2: ");	
		num2 = sc.nextInt();
		
		if (num1 < num2) {
			System.out.println("El menor es: " + num1);
		}
		else {
			if (num2 < num1) {
				System.out.println("El menor es: " + num2);
			}
			else {
				System.out.println("Los números son iguales2");
			}
		}
		}

	}


