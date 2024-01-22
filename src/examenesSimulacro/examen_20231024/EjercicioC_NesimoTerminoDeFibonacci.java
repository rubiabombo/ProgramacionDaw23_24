package examenesSimulacro.examen_20231024;

import utils.Utils;

public class EjercicioC_NesimoTerminoDeFibonacci {

	public static void main(String[] args) {
		int n = 0;
		int n_1 = 1;
		int n_2 = 2;
		int contTerminosPedidos;
		
		contTerminosPedidos = Utils.pideNumeroEntero("¿Qué término de la serie deseas?");
		switch (contTerminosPedidos) {
		case 1:
		case 2:
			System.out.println("1");
			break;
		default:
			for (int i =3; i <= contTerminosPedidos; i++) {
				n = n_1 + n_2;
				n_2 = n_1;
				n_1 = n;
			}
			System.out.println(n);
		
		
		}
		
	}

}
