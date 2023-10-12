package capitulo4.bloque1;

import utils.Utils;
import utils.UtilsArrays;

public class Ej03_InicialzaArrayMuestraOrdenInverso {

	public static void main(String[] args) {

		int array[] = UtilsArrays.creaArrayNumerosAzar(15, 0, 100);

		UtilsArrays.mostrarArray(array);

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

}
