package capitulo3.bloque4;

import java.util.Scanner;

public class Ejercicio04_ImprimirEnteroEnBinario {

	public static void main(String[] args) {
		int numAImprimirEnBinario, numDescubrimientoBits;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzco un número y lo voy a  imprimir en Binario: ");
		numAImprimirEnBinario = sc.nextInt();
		numDescubrimientoBits = 128;
		
		while (numDescubrimientoBits > 0) {
			
			if ((numDescubrimientoBits & numAImprimirEnBinario) != 0) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
			
			numDescubrimientoBits /= 2;
		}
		

	}

}
