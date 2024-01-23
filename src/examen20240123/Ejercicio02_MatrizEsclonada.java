package examen20240123;

public class Ejercicio02_MatrizEsclonada {
	
	public static void main(String[] args) {
		// Inicializar la matriz
		int[][] matriz = { { 1, 2, 3, 4, 5 },
									{ 6, 7, 8, 9, 10}, 
									{ 11, 12, 13, 14, 15 }, 
									{ 16, 17, 18, 19, 20 },
									{ 21, 22, 23, 24, 25 } };

		// Mostrar la matriz en la consola
		System.out.println("Matriz:");
		mostrarMatriz(matriz);

		// Verificar si es una matriz escalonada
		if (esMatrizEscalonada(matriz)) {
			System.out.println("La matriz es escalonada.");
		} else {
			System.out.println("La matriz NO es escalonada.");
		}
	}

	// Método para mostrar la matriz en la consola
	private static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// Método para verificar si la matriz es escalonada
	private static boolean esMatrizEscalonada(int[][] matriz) {
		for (int i = 1; i < matriz.length; i++) {
			// Comprobar si el primer elemento de la fila actual es mayor que el último de
			// la fila anterior
			if (matriz[i][0] <= matriz[i - 1][matriz[i - 1].length - 1]) {
				return false;
			}
		}
		return true;
	}

}
