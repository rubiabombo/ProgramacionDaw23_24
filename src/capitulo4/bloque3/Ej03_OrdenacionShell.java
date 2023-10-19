package capitulo4.bloque3;

public class Ej03_OrdenacionShell {

	public static void main(String[] args) {
		int posicionMenor, aux;
		int saltos[] = new int[] {6, 4, 3, 2, 1};
		
		
		
		int array[] = new int[] {90, 17, 23, 15, 39, 7, 80, 72};
		System.out.println("ORIGINAL");
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println("");
		
		
		// ORDENO POR SHELL
		for (int i = 0; i < saltos.length; i++) {
			System.out.println("Voy a utilizar salto: " + saltos[i]);
			for (int j = 0; j < array.length; j++) {
				System.out.println("\tj: " + j);
				if (j + saltos[i] < array.length) {
					if (array[j] > array[j + saltos [i]]) {
						aux = array[j];
						array[j] = array[j + saltos[i]];
						array[j + saltos[i]] = aux;
					}
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
