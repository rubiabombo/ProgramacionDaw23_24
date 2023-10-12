package capitulo4.bloque1;

import utils.UtilsArrays;

public class Ej01_InicializaArraySumaMediaMayorMenor {

	public static void main(String[] args) {
		int array[] = UtilsArrays.creaArrayNumerosAzar(15, 0, 100);

		UtilsArrays.mostrarArray(array);
		
		System.out.println("Suma vale: " + UtilsArrays.sumaDelArray(array));
		System.out.println("Media vale: " + UtilsArrays.mediaDelArray(array));
		System.out.println("Mayor vale: " + UtilsArrays.mayorDelArray(array));
		System.out.println("Menor vale: " + UtilsArrays.menorDelArray(array));

	}
}
