package capitulo4.bloque7;

import java.util.Arrays;
import java.util.Random;

public class Ej01_ArrayDePosiciones {

	public static void main(String[] args) {
		

		int[] n = new int[20];
		int[] par = new int[20];
		int[] impar = new int[20];
		int i;
		int pares = 0;
		int impares = 0;

		for (i = 0; i < 20; i++) {
			n[i] = (int) (Math.random() * 101);
			// Separa los números metiendo los pares en un array
			// y los impares en otro.
			if (n[i] % 2 == 0) {
				par[pares++] = n[i];
			} else {
				impar[impares++] = n[i];
			}
		}

		// Muestra el array original
		System.out.println("Array original:");
		for (i = 0; i < 20; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();

		// Mete los pares en las primeras posiciones
		// del array original.
		for (i = 0; i < pares; i++) {
			n[i] = par[i];
		}

		// Mete los impares en los huecos que quedan.
		for (i = pares; i < 20; i++) {
			n[i] = impar[i - pares];
		}

		// Muestra el resultado.
		System.out.println("Array con los pares al principio:");
		for (i = 0; i < 20; i++) {
			System.out.print(n[i] + " ");
		}
	}

}
