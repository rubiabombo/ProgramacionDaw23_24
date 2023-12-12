package capitulo4.bloque1;

import utils.UtilsArrays;

public class Ejercicio06_SumaValoresIndicePar {

	public static void main(String[] args) {
		int array[] = new int[5];
		int sumaPares = 0, sumaImpares = 0;
		
		UtilsArrays.inicializaArray(array, 0, 100);
		
		UtilsArrays.imprimeArray(array);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sumaPares += array[i];
			}
			else {
				sumaImpares += array[i];
			}
		}
		
		System.out.println("Suma pares: " + sumaPares);
		System.out.println("Suma impares: " + sumaImpares);
	}

}







