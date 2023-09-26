package capitulo2.bloque2;

import java.util.Scanner;

public class Ejercicio02_ContadoresDeNumerosPorCategorias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int contNegativos = 0, contPequenios = 0;
		int contMedios = 0, contGrandes = 0;

		//primer número
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		if (num < 0) {
			return;
		}
		else {
			if (num <= 25) {
				contPequenios += 1;
			}
			else {
				if (num <= 250) {
					contMedios++;
				}
				else {
					contGrandes++;
				}
			}
		}		

		// segundo número
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		if (num < 0) {
			System.exit(0);
		}
		else {
			if (num <= 25) {
				contPequenios += 1;
			}
			else {
				if (num <= 250) {
					contMedios++;
				}
				else {
					contGrandes++;
				}
			}
		}		

	}	


	}


