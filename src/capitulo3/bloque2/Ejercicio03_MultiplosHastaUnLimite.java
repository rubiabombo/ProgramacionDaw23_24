package capitulo3.bloque2;

import java.util.Scanner;

public class Ejercicio03_MultiplosHastaUnLimite {

	public static void main(String[] args) {
		int num, repeticiones;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número para saber sus múltiplos: ");
		num = sc.nextInt();
		
		for (int i = 0; i < 100; i+=num) {
			System.out.println("Múltiplo de " + num + ":" + i);
		}
		
	}

}
