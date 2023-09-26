package capitulo2.bloque1;

import java.util.Scanner;

public class Ejercicio06_ComprobarNumeroPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Introduzca el número: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
	}

}

