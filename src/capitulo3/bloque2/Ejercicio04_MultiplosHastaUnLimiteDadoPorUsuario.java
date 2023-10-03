package capitulo3.bloque2;

import java.util.Scanner;

public class Ejercicio04_MultiplosHastaUnLimiteDadoPorUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, limite;
		
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		System.out.println("Introduzca el límite:");
		limite = sc.nextInt();
		
		for (int i = 0; (num * i) < 100; i++) {
			System.out.println("Múltiplo de " + num + ": " + (num * i));
		}
	}
	
}
