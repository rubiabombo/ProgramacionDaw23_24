package capitulo4.bloque3;

public class Ej01_OrdenacionBurbuja {

	public static void main(String[] args) {
		
		int array[] = new int[10];
		boolean seHanHechoIntercambios;
		
		for ( int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		
		System.out.println("ORIGINAL");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
		System.out.println("");
		
		
		do {
			seHanHechoIntercambios = false;

			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i+1]) {
					int aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
					seHanHechoIntercambios = true;
				}
			}

		} while (seHanHechoIntercambios == true);
		
		
		System.out.println("ORDENADO");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
		System.out.println("");

	}

}
