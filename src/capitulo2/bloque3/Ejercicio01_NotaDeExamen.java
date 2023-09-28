package capitulo2.bloque3;

import java.util.Scanner;

public class Ejercicio01_NotaDeExamen {

	public static void main(String[] args) {
		int nota;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la nota: ");
		nota = sc.nextInt();
		
		switch (nota) {
		case 0:
		case 1:
		case 2:
			System.out.println("Muy deficiente");
			break;
		case 3:
		case 4:
			System.out.println("Deficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Error, el valor no pertrenece a ninguna nota");
		}
	}

}
