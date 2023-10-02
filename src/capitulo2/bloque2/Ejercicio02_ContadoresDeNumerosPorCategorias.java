package capitulo2.bloque2;

import java.util.Scanner;

public class Ejercicio02_ContadoresDeNumerosPorCategorias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int contNegativos = 0, contPequenios = 0;
		int contMedios = 0, contGrandes = 0;

		// primer número
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		if (num < 0) {
			return;
		} else {
			if (num <= 25) {
				contPequenios += 1;
			} else {
				if (num <= 250) {
					contMedios++;
				} else {
					contGrandes++;
				}
			}
		}

		// segundo número
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		if (num < 0) {
			System.exit(0);
		} else {
			if (num <= 25) {
				contPequenios += 1;
			} else {
				if (num <= 250) {
					contMedios++;
				} else {
					contGrandes++;
				}
			}
			
		}
		 	System.out.println("Cantidad de números negativos: " + contNegativos);
	        System.out.println("Cantidad de números bajos (entre 0 y 25): " + contPequenios);
	        System.out.println("Cantidad de números medios (entre 26 y 250): " + contMedios);
	        System.out.println("Cantidad de números grandes (mayores de 250): " + contGrandes);
	}
}
