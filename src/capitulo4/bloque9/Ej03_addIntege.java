package capitulo4.bloque9;

import utils.UtilsArrays;

public class Ej03_addIntege {

	public static void main(String[] args) {
		/*
		 * Declaro el array y le doy la longitud y el valor con un método
		 */
		int arrayOrig[] = UtilsArrays.creaArrayNumerosAzar(20, 0, 200);
		
		/*
		 * Muestro el Array original
		 */
		System.out.println("Array Original:");
		UtilsArrays.mostrarArray(arrayOrig);
		
		/*
		 * Creo un nuevo Array y le asignaremos el valor del método addInteger
		 */
		int arrayNuevo[] = addInteger(arrayOrig, 444);
		
		/*
		 * Muestro el Nuevo array
		 */
		System.out.println("\n\nNuevo Array con entero añadido al final:");
		UtilsArrays.mostrarArray(arrayNuevo);
	}

	public static int[] addInteger(int array[], int num) {
		/*
		 * Creo un nuevo array
		 */
		int nuevoArray[] = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			nuevoArray[i] = array[i];
		}
		nuevoArray[nuevoArray.length - 1] = num;
		return nuevoArray;

	}

}
