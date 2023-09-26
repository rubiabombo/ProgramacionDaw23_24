package capitulo2.bloque1;

import java.util.Scanner;

public class Ejercicio07_ComprobarNumeroParANivelDeBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
	
		System.out.println("Introduzca el número: ");
		num = sc.nextInt();
		
		if ((num & 1) == 0) {
			System.out.println("El número es par ");	
		}
		else {
			System.out.println("El número es impar ");
		}
	}

}
