package examenesSimulacro.examen_20231024;

import utils.Utils;

public class EjercicioA_SumaPrimosTantosComoIndiqueUsuario {

	public static void main(String[] args) {
		int numeroPrimosPedidos;
		int primosEncontrados= 0;
		int candidatoAPrimo=2;
		boolean candidatoEsPrimo;
		int sumaPrimos = 0;
		
		numeroPrimosPedidos = Utils.pideNumeroEntero("Cuántos primos desea sumar?: ");
		
		
		while (primosEncontrados < numeroPrimosPedidos) {
			//Voy a comprobar si un número es primo
			candidatoEsPrimo = true;
			for (int i = 2; i < candidatoAPrimo; i++) {
				if (candidatoAPrimo % i == 0) {
					candidatoEsPrimo = false;
					break;
				}
			}
			
			
			//Sobre la variable booleana puedo comprobar si se han encontrado, o no 
			//divisores para el candidatoAPrimo
			
			if(candidatoEsPrimo == true) {
				System.out.println(candidatoAPrimo + " ");
				primosEncontrados++;
				sumaPrimos += candidatoAPrimo;
			}
			//Aumento el valor del candidato para probar el siguiente  número
			candidatoAPrimo++;
		}
		
		//Imprimo la suma de los primos
		System.out.println("\n La suma de los primos encontrados es: " + sumaPrimos);
		
	}
	}