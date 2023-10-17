package capitulo4.bloque2;

import utils.Utils;
import utils.UtilsArrays;

public class Ej05_CicloEnArrayHaciaDerechaTantosLugaresComoDigaUsuario {

	public static void main(String[] args) {
		
		int array[] = UtilsArrays.creaArrayNumerosAzar(5, -100, 100);
		UtilsArrays.mostrarArray(array);
		
		
		int numCiclos = Utils.obtenerEnteroConDescripcion("Introduzca un número de veces a desplazar los elementos ");
		
		for(int i = 0; i < numCiclos; i++) {
			int aux = array[array.length -1];
			for(int j = array.length -1; j > 0; j--) {
				array[j] = array[j-1];
			}
			array[0] = aux;
		}
		
		UtilsArrays.mostrarArray(array);
	}

}
