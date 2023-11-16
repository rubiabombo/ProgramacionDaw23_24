package capitulo4.bloque9;

public class Ej01MetodoEnteroDevuelveCaracteres {

	public static void main(String[] args) {
		int array[] = new int[] {77, 97, 114, 105, 97, 32, 74, 101, 115, 117, 115};
		
		String str = stringFromArray(array);
		System.out.println("str: " + str);

	}

	
	/*
	 * Método para mostrar array en pantalla guardándolo ebn string
	 */
	public static String stringFromArray(int[] array) {
		String str = ""; 
		
		for(int i = 0; i < array.length; i++) {
			str += (char) array[i] + " ";
		}
		return str;
	}

}
