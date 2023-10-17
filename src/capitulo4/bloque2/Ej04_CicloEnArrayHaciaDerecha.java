package capitulo4.bloque2;

import utils.UtilsArrays;

public class Ej04_CicloEnArrayHaciaDerecha {

	public static void main(String[] args) {
		
		int array[] = UtilsArrays.creaArrayNumerosAzar(5, 0, 100);
		UtilsArrays.mostrarArray(array);
		
		int aux = array[array.length - 1];
		
		for (int i = array.length -1; i > 0; i--) {
			array[i] = array[i-1];
		}
		array[0] = aux;
		
		UtilsArrays.mostrarArray(array);

	}

}
