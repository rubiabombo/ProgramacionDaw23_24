package capitulo4.bloque1;

import utils.Utils;
import utils.UtilsArrays;

public class Ej02_InicializaArrayEntreLimites {

	public static void main(String[] args) {
		int limiteInferior = Utils.obtenerEnteroConDescripcion("Límite inferior: ");
		int limiteSuperior = Utils.obtenerEnteroConDescripcion("Límite superior: ");
		int array[] = UtilsArrays.creaArrayNumerosAzar(5, limiteInferior, limiteSuperior);
		
		UtilsArrays.mostrarArray(array);
	}

}
