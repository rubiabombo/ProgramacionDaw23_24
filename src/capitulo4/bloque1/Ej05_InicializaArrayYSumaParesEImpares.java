package capitulo4.bloque1;

import utils.UtilsArrays;

public class Ej05_InicializaArrayYSumaParesEImpares {

	public static void main(String[] args) {
		int array[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 100);
		int sumaPares = 0, sumaImpares = 0;
		
		UtilsArrays.mostrarArray(array);

		// Ahora busco el valor buscado
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) sumaPares += array[i];
			else sumaImpares += array[i];
		}
		
		// Ponemos resultados
		System.out.println("Suma pares: " + sumaPares + " - Suma impares: " + sumaImpares);

	}

}
