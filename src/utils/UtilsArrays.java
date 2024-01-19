package utils;



public class UtilsArrays {
	/**
	 * Imprime el array en consola, de forma que queda en una única línea y con
	 * un espacio en blanco entre valores
	 * @param num
	 */
	public static void imprimeArray (char[] comb) {
		for (int i = 0; i < comb.length; i++) {
			System.out.print(comb[i] + " ");
		}
		System.out.println();
	}
	/**
	 * 
	 * @param a
	 * @param limInf
	 * @param limSup
	 */
	public static void inicializaArray (int a[], int limInf, int limSup) {
		for (int i = 0; i < a.length; i++) {
			a[i] = Utils.obtenerNumeroAzar(limInf, limSup);
		}
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void mostrarArrayConDescripcion (int[] array, String texto) {
		System.out.println(texto);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void mostrarArray (int[] array) {
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void mostrarArrayDouble (double[] array) {
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void mostrarArrayChar (char[] array) {
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void mostrarArrayFloat (float[] array) {
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 
	 * @param longitud
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public static int[] creaArrayNumerosAzar (int longitud, int limInf, int limSup) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(limInf, limSup);
		}
		return array;
	}

	/**
	 * 
	 * @param longitud
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public static int[] creaArrayNumerosUsuario (int longitud) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerEntero();
		}
		return array;
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public static void ordenaArray (int array[]) {

	
		
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			// Empieza el algoritmo
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i+1] < array[i]) {
					// Entonces hago un intercambio
					int aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios);

	}
	
	public static void inicializaMatriz (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar(0, 100);
			}
		}
	}
	
	public static void inicializaMatriz1000 (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar(0, 1000);
			}
		}
	}
	
	public static void mostrarMatriz (int matriz[][]) {
		System.out.println("Contenido de la matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void mostrarMatrizChar (char matriz[][]) {
		System.out.println("Contenido de la matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static int[][] creaEInicializaMatriz (int filas, int cols, int valorInicial) {
		int m[][] = new int[filas][cols];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = valorInicial;
			}
		}
		
		return m;
	}
	public static void imprimeMatriz(int[][] m1) {
		// TODO Auto-generated method stub
		
	}
	public static void imprimeArray(int[] m) {
		// TODO Auto-generated method stub
		
	}
	public static int[][] creaEInicializaMatrizAlAzar(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return null;
	}
	public static String suma(int[] array) {
		// TODO Auto-generated method stub
		return null;
	}
	public static String promedia(int[] array) {
		// TODO Auto-generated method stub
		return null;
	}
	public static String menor(int[] array) {
		// TODO Auto-generated method stub
		return null;
	}
	public static String mayor(int[] array) {
		// TODO Auto-generated method stub
		return null;
	}


}
