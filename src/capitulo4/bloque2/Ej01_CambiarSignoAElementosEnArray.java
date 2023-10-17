package capitulo4.bloque2;

import utils.UtilsArrays;

public class Ej01_CambiarSignoAElementosEnArray {

	public static void main(String[] args) {
		int array[]= UtilsArrays.creaArrayNumerosAzar(150, -100, 100);
		UtilsArrays.mostrarArray(array);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] *= -1;
			}
		}
		
		UtilsArrays.mostrarArray(array);
		
	}

}
