package capitulo4.bloque3;

public class Ej04_OrdenacionSeleccionDirecta {

	public static void main(String[] args) {
		int posicionMenor, aux;

		int array[] = new int[] { 90, 17, 23, 15, 39, 7, 80, 72 };

		System.out.println("Original");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		
		
		//ORDENO POR SELECCION DIRECTA
		for (int i = 0; i < array.length; i++) {
			for (int j = i + i; j < array.length; j++){
				if (array[j] < array [i]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		
		System.out.println("ORDENADO");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println("");
		
		
		
		
		
		
		

	}

}
