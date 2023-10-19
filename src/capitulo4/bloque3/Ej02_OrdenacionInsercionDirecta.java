package capitulo4.bloque3;

public class Ej02_OrdenacionInsercionDirecta {

	public static void main(String[] args) {
		int posicionMenor, aux;
		int array[] = new int[] {7, 5, 17, 15, 23, 1, 90};
		
		System.out.println("Original");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");

		
		// Ordeno por inserción directa
		for (int i = 0; i < array.length; i++) {
			System.out.println("i: " + i);
			posicionMenor = i;
			for (int j = i + 1; j < array.length; j++) {
				System.out.println("\tj:" + j);
				if (array[j] < array[posicionMenor]) {
					posicionMenor = j;
					System.out.println("\tEl nuevo menor es: " + array[posicionMenor] + 
							" en la posición " + j);
				}
			}
			
			aux = array[posicionMenor];
			for (int j = posicionMenor; j > i; j--) {
				System.out.println("\tVoy a desplazar en j: " + j);
				array[j] = array[j-1];
			}
			array[i] = aux;
			
			
			
			System.out.println("\tPosicionMenor: " + posicionMenor);
		}
		
		
		System.out.println("ORDENADO");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		
	}
	
	

}
