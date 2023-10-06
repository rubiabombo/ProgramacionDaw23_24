package capitulo3.bloque4;

import java.util.Scanner;

public class Ejercicio02_NumerosPrimosOCompuestoEntreLimitesSinFor {

	public static void main(String[] args) {
		int i, limiteInf, limiteSup, numInvestigado;
		Scanner sc = new Scanner(System.in);
		boolean numeroTieneDivisores;
		
		System.out.println("Introduzca un límite: ");
		limiteInf = sc.nextInt();
		System.out.println("Introduzca un límite: ");
		limiteSup = sc.nextInt();
		
		numInvestigado = limiteInf;
		
		while (numInvestigado <= limiteSup) {
			numeroTieneDivisores = false;
			i = 2;
			
			while (i < numInvestigado) {
				if(numInvestigado % i == 0) {
					numeroTieneDivisores = true;
					break;
				}
				i++;
			}
			if(numeroTieneDivisores == true) {
				System.out.println("El número " + numInvestigado + " es compuesto");
			}
			else {
				System.out.println("El número " + numInvestigado + " es primo");
			}
			numInvestigado++;
		}

	}

}
