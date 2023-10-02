package capitulo3.bloque1;

import java.util.Scanner;

public class Ejercicio01_SumarNumerosMayoresDe10 {

	public static void main(String[] args) {
		int num, suma = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Introduce un número: ");
			
			num = sc.nextInt();
			
			if (num > 10) {
				suma += num;
			}
		}
		System.out.println("Muestra la suma de los totales: " + suma);

	}

}
