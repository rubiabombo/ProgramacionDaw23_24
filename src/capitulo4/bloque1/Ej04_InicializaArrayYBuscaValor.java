package capitulo4.bloque1;

import utils.Utils;
import utils.UtilsArrays;

public class Ej04_InicializaArrayYBuscaValor {

	public static void main(String[] args) {
		int valorBuscado;
		int array[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 100);
		boolean estaValorEnArray = false;
		
		// Pido el valor a buscar
		valorBuscado = Utils.obtenerEnteroConDescripcion("Introduzca el valor buscado: ");

		UtilsArrays.mostrarArray(array);

		// Ahora busco el valor buscado
		for (int i = 0; i < array.length; i++) {
			if (valorBuscado == array[i]) {
				estaValorEnArray = true;
				System.out.println("Encontrado " + valorBuscado + " en posición: " + i);
			}
		}
		
		// Puede ser que el valor no esté encontrado
		if (!estaValorEnArray) {
			System.out.println("El valor " + valorBuscado + " no está en el array");
		}

	}

}
