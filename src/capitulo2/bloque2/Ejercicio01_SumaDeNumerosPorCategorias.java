package capitulo2.bloque2;

import java.util.Scanner;

public class Ejercicio01_SumaDeNumerosPorCategorias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sumaNegativos = 0, sumaPequenios = 0;
		int sumaMedios = 0, sumaGrandes = 0;

		// Gestión del primer número
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		if (num < 0) {
			sumaNegativos = sumaNegativos + num;
		}
		else {
			if (num <= 25) {
				sumaPequenios += num;
			}
			else {
				if (num <= 250) {
					sumaMedios += num;
				}
				else {
					sumaGrandes += num;
				}
			}
		}		
	
		// Primer número
				System.out.println("Introduce un número: ");
				num = sc.nextInt();
				if (num < 0) {
					sumaNegativos = sumaNegativos + num;
				}
				else {
					if (num <= 25) {
						sumaPequenios += num;
					}
					else {
						if (num <= 250) {
							sumaMedios += num;
						}
						else {
							sumaGrandes += num;
						}
					}
				}		
				// Segundo número
				System.out.println("Introduce un número: ");
				num = sc.nextInt();
				if (num < 0) {
					sumaNegativos = sumaNegativos + num;
				}
				else {
					if (num <= 25) {
						sumaPequenios += num;
					}
					else {
						if (num <= 250) {
							sumaMedios += num;
						}
						else {
							sumaGrandes += num;
						}
					}
				}		
				// Tercer número
				System.out.println("Introduce un número: ");
				num = sc.nextInt();
				if (num < 0) {
					sumaNegativos = sumaNegativos + num;
				}
				else {
					if (num <= 25) {
						sumaPequenios += num;
					}
					else {
						if (num <= 250) {
							sumaMedios += num;
						}
						else {
							sumaGrandes += num;
						}
					}
				}		
				// Cuarto número
				System.out.println("Introduce un número: ");
				num = sc.nextInt();
				if (num < 0) {
					sumaNegativos = sumaNegativos + num;
				}
				else {
					if (num <= 25) {
						sumaPequenios += num;
					}
					else {
						if (num <= 250) {
							sumaMedios += num;
						}
						else {
							sumaGrandes += num;
						}
					}
				}		
				// Quinto número
				System.out.println("Introduce un número: ");
				num = sc.nextInt();
				if (num < 0) {
					sumaNegativos = sumaNegativos + num;
				}
				else {
					if (num <= 25) {
						sumaPequenios += num;
					}
					else {
						if (num <= 250) {
							sumaMedios += num;
						}
						else {
							sumaGrandes += num;
						}
					}
				}		
				 System.out.println("Suma de números negativos: " + sumaNegativos);
			        System.out.println("Suma de números pequeñoss (entre 0 y 25): " + sumaPequenios);
			        System.out.println("Suma de números medios (entre 26 y 250): " + sumaMedios);
			        System.out.println("Suma de números grandes (mayores de 250): " + sumaGrandes);
	
	}	
}
