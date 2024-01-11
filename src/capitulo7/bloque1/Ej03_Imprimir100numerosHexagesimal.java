package capitulo7.bloque1;

import java.util.Scanner;

public class Ej03_Imprimir100numerosHexagesimal {

	public static void main(String[] args) {
		System.out.println("Decimal   Hexagesimal");
		System.out.println("---------------------");
		for (int i = 0; i < 101; i++) {
			System.out.println("  " + i + "          " + Integer.toHexString(i) );
		}

	}

}
