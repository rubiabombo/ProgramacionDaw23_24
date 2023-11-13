package capitulo4.bloque7;

import java.util.Scanner;

public class Ej03_ObtenerDni {

	private static final char[] LETRA = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	public char obtenerLetraDNI1(int numDNI) {
		return LETRA[numDNI % 23];
	}	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numDNI;
		Ej03_ObtenerDni letra = new Ej03_ObtenerDni();
		System.out.print("Introduzca número del DNI: ");
		numDNI = Integer.parseInt(entrada.nextLine());		
		System.out.println("\nEl DNI con letra es: " + numDNI + ( letra).obtenerLetraDNI1(numDNI));
		entrada.close();
		

	}

}
