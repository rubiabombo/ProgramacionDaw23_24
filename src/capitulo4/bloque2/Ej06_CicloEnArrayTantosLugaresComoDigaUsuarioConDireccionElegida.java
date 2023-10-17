package capitulo4.bloque2;

import utils.Utils;
import utils.UtilsArrays;

public class Ej06_CicloEnArrayTantosLugaresComoDigaUsuarioConDireccionElegida {

	public static void main(String[] args) {


		int array[] = UtilsArrays.creaArrayNumerosAzar(5, -100, 100);
		UtilsArrays.mostrarArray(array);
		
		
		int direccion = Utils.obtenerEnteroConDescripcion("Indique la direccion del ciclo\n"
				+ "\n0.- Ciclo a derecha"
				+ "\n1.- Ciclo a izquierda");
		int numCiclos = Utils.obtenerEnteroConDescripcion("Elija cuántos ciclos debe realizar");
		
		for(int i = 0; i < numCiclos; i++) {
			switch (direccion) {
			case 0:
				int aux = array[array.length -1];
				for (int j = array.length -1; j > 0; j--) {
					array[j] = array[j-1];
				}
				array[0] = aux;
				break;
			
			case 1:
				aux = array[0];
				for(int j = 0; j <  array.length -1; j++) {
					array[j] = array[j+1];
				
				}
				array[array.length-1] = aux;
				break;
			}
		}
		UtilsArrays.mostrarArray(array);

	}

}
