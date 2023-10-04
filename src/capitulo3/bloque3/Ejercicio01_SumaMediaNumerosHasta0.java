package capitulo3.bloque3;

import java.util.Scanner;

public class Ejercicio01_SumaMediaNumerosHasta0 {

	public static void main(String[] args) {
		int num = 1, suma = 0;
		float media = 0;
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; num != 0; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			suma += num;
			
			if (num != 0) {
				media = suma / (float) (i + 1);
			}
		}
		
		System.out.println("La media vale: " + media);
	}

}
