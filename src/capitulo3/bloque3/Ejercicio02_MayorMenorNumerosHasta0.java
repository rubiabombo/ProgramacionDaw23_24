package capitulo3.bloque3;

import java.util.Scanner;

public class Ejercicio02_MayorMenorNumerosHasta0 {

	public static void main(String[] args) {
		int num = 1, numMayor = 1, numMenor = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; num != 0; i++) {
			System.out.println("Introduzca número: ");
			num = sc.nextInt();
			if (num == 0) {
				break;
			}
			if (i == 0) {
				numMayor = num;
				numMenor = num;
			}
			else {
				if(num > numMayor) numMayor = num;
				if(num < numMenor) numMenor = num;
			}
		}
		
		System.out.println("Mayor: " + numMayor + " - Menor: " + numMenor );

	}

}
