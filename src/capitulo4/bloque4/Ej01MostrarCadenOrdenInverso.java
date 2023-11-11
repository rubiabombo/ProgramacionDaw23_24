package capitulo4.bloque4;

import java.util.Scanner;



public class Ej01MostrarCadenOrdenInverso {
	public static void main(String[] args) {

		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca cadena: ");
		s = sc.nextLine();
		
		muestraCadenaOrdenInverso(s);
	}

	public static void muestraCadenaOrdenInverso(String srt) {
		for (int i = srt.length() - 1; i > -1; i--) {
			System.out.println(srt.charAt(i));
		}
		
	}
}
