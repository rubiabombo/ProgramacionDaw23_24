package capitulo4.bloque9;

import utils.UtilsArrays;

public class Ej04_CountOccurrences {

	public static void main(String[] args) {
		/*
		 * Declaro un array. Le doy longitud y valor con un método
		 */
		int array[] = UtilsArrays.creaArrayNumerosAzar(25, 0, 10);
		/*
		 * Muestro el array
		 */
		UtilsArrays.mostrarArray(array);

		/*
		 * creo una variable donde almacenaré la cantidad del método. Lo muestro en
		 * consola
		 */

		int contador = countOccurrences(array, 3);
		System.out.println("\n\nNº de veces que aparece el número introducido: " + contador);

	}

	/**
	 * Método que recorre un array y compara un número introducido por el usuario y
	 * devuelve la cantidad de veces que aparece dicho número
	 */
	public static int countOccurrences(int array[], int num) {
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				cont++;
			}
		}

		return cont;

	}

}
