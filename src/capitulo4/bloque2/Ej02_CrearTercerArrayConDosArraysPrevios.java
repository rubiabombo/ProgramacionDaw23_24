package capitulo4.bloque2;

import utils.UtilsArrays;

public class Ej02_CrearTercerArrayConDosArraysPrevios {

	public static void main(String[] args) {
		
		 int primerArray[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 100);
		 int segundoArray[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 100);
		 int tercerArray[] = new int [150];
		 
		 
		 UtilsArrays.mostrarArray(primerArray);
		 UtilsArrays.mostrarArray(segundoArray);
		 
		 
		for (int i = 0; i < tercerArray.length; i++) {
			if(i % 2 == 0) {
				tercerArray[i] = primerArray[i];
			}
			else {
				tercerArray[i] = segundoArray[i];			}
		}
		
		UtilsArrays.mostrarArray(tercerArray);
	}

}
