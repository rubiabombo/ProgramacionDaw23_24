package capitulo4.bloque9;

import utils.UtilsArrays;

public class Ej05_MetodoRemoveInteger {

	public static void main(String[] args) {
		// Creo el array con un método
		int array[] = UtilsArrays.creaArrayNumerosAzar(20, 0, 10);
		// Muestro el Array original
		System.out.println("Array Original:");
		UtilsArrays.mostrarArray(array);

		// Creo un nuevo array con el valor del método con el número removido
		// int arrayNuevo[] = removeInteger(array, 3);

		// Muestro el Array con los valores eliminados
		System.out.println("\n\nArray con enteros eliminados:");
		// UtilsArrays.mostrarArray(arrayNuevo);

	}

}
