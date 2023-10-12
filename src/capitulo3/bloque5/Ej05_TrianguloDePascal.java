package capitulo3.bloque5;

import java.util.Scanner;

public class Ej05_TrianguloDePascal {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el número de filas para el Triángulo de Pascal: ");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(calcularCoeficienteBinomial(i, j) + " ");
			}
			System.out.println();
		}

	}

	// Función para calcular el coeficiente binomial C(n, k)
	public static int calcularCoeficienteBinomial(int n, int k) {
		if (k == 0 || k == n) {
			return 1;
		} else {
			return calcularCoeficienteBinomial(n - 1, k - 1) + calcularCoeficienteBinomial(n - 1, k);
		}
	}
}
