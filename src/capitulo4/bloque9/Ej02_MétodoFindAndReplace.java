package capitulo4.bloque9;

import utils.UtilsArrays;

public class Ej02_MétodoFindAndReplace {

	public static void main(String[] args) {
		
		/*
		 *  Creo el array con numeros al azar entre 0 y 10 y una longitud de 20
		 */
		int array[] = UtilsArrays.creaArrayNumerosAzar(20, 0, 10);
		
		/*
		 * Muestro el Array
		 */
		System.out.println("Array Original:");
		UtilsArrays.mostrarArray(array);
		/*
		 * Llamo al método el cuál modificará los valores del array si cumple las condiciones
		 */
		findAndReplace(array, 4, 333);
		System.out.println("\nArray con número reemplazado");
		UtilsArrays.mostrarArray(array);

	}

	/**
	 * Método que recibe como parametro de entrada un array entero, un entero que
	 * será el número buscado y otro el que sustituirá al buscado en el array.
	 */
	public static void findAndReplace(int array[], int buscado, int sustituto) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == buscado) {
				array[i] = sustituto;
			}
		}

	}

}
