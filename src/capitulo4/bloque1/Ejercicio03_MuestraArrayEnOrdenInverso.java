package capitulo4.bloque1;

import utils.UtilsArrays;

public class Ejercicio03_MuestraArrayEnOrdenInverso {

	public static void main(String[] args) {
		int array[] = new int[5];
		
		UtilsArrays.inicializaArray(array, 0, 100);
		
		UtilsArrays.imprimeArray(array);
		
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

}
