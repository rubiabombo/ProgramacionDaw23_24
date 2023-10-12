package capitulo3.bloque5;

import java.util.Scanner;

public class Ej01_SumaDigitos {

	public static void main(String[] args) {
		int num, suma;
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Ingresa un número entero: ");
	        
	        num = sc.nextInt();
	        suma = sumarDigitos(num);
	        
	        System.out.println("La suma de los dígitos es: " + suma);
	        
	    }
	    
	    public static int sumarDigitos(int numero) {
	        int suma = 0;
	        
	        while (numero != 0) {
	            int digito = numero % 10;
	            suma += digito;
	            numero /= 10;
	        }
	        
	        return suma;
	    }

	}


