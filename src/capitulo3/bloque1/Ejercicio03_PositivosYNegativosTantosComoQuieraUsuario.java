package capitulo3.bloque1;

import java.util.Scanner;

public class Ejercicio03_PositivosYNegativosTantosComoQuieraUsuario {

	public static void main(String[] args) {
		int num, repeticiones, numPositivos = 0, numNegativos = 0;
		System.out.println("Introduzca la cantidad de números que quiere insertar: ");
		Scanner sc = new Scanner(System.in);
		repeticiones  = sc.nextInt();
		
		for (int i = 0; i < repeticiones; i++) {
			System.out.println("Introduzca el número: ");
			num = sc.nextInt();
			if (num> 0) {
				numPositivos++;
			}
			else if(num < 0) {
				numNegativos++;
			}
			
		}
		System.out.println("La cantidad de números positivos es: " + numPositivos + 
				"\n La cantidad de números negativos es: " + numNegativos);
		

	}

}
