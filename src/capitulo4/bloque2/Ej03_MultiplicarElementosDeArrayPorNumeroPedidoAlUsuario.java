package capitulo4.bloque2;

import javax.swing.JOptionPane;

import utils.UtilsArrays;

public class Ej03_MultiplicarElementosDeArrayPorNumeroPedidoAlUsuario {

	public static void main(String[] args) {
		
		int array[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 100);
		UtilsArrays.menorDelArray(array);
		
		int numUsuario = utils.Utils.obtenerEnteroConDescripcion("Introduzca un factor para multiplicar elementos del array: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] *= numUsuario; 
		}
		
		UtilsArrays.mostrarArray(array);
	}

}
