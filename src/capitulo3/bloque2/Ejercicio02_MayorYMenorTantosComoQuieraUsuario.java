package capitulo3.bloque2;

import java.util.Scanner;

public class Ejercicio02_MayorYMenorTantosComoQuieraUsuario {

	public static void main(String[] args) {
		int suma = 0, num, repeticiones, mayor = 0, menor = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuántos números vas a introducir?");
		repeticiones = sc.nextInt();

		for (int i = 0; i < repeticiones; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();

			if (i == 0) {
				mayor = num;
				menor = num;
			} else {
				if (num > mayor)
					mayor = num;
				if (num < menor)
					menor = num;
			}

		}
		
		System.out.println("Mayor: " + mayor);
		System.out.println("Menor: " + menor);

	}
}
