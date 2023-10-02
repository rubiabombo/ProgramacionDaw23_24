package capitulo3.bloque1;

import java.util.Scanner;

public class Ejercicio02_SumarNumerosMayoresDe10TantosComoQuieraUsuario {

	public static void main(String[] args) {
		int num, suma = 0, repeticiones;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca la cantidad de números a sumar: ");
		repeticiones = sc.nextInt();

		for (int i = 0; i < repeticiones; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();

			if (num > 10) {
				suma += num;
			}

		}
		System.out.println("Muestra la suma de los totales: " + suma);
	}

}
