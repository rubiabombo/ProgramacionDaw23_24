package examen20240123;

import java.util.Random;

import utils.UtilsArrays;

public class Ejercicio01_NumerosContiguos {
	   public static void main(String[] args) {
	/// Inicializa un array de 10 elementos con valores enteros al azar entre 0 y 20.
    int[] array = new int[10];
    Random random = new Random();

    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(21); // Valores entre 0 y 20
    }

    // Encuentra los tres elementos contiguos que proporcionen la mayor suma.
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i <= array.length - 3; i++) {
        int sum = array[i] + array[i + 1] + array[i + 2];

        if (sum > maxSum) {
            maxSum = sum;
        }
    }

    // Muestra en consola los tres números que aportan la suma máxima.
    System.out.println("Array generado:");
    for (int value : array) {
        System.out.print(value + " ");
    }

    System.out.println("\nLos tres números que aportan la suma máxima son:");
    for (int i = 0; i < array.length - 2; i++) {
        if (array[i] + array[i + 1] + array[i + 2] == maxSum) {
            System.out.print(array[i] + " ");
            System.out.print(array[i + 1] + " ");
            System.out.print(array[i + 2] + " ");
            break; // Termina el bucle una vez que se encuentran los elementos que aportan la suma máxima.
        }
    }
}
		}

