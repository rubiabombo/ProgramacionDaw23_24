package capitulo3.bloque5;

import java.util.Scanner;

public class Ej02_SecuenciaFibonacci {


		    public static void main(String[] args) {
		    	int num;
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Ingrese el número de términos de la secuencia de Fibonacci que desea imprimir: ");
		        num = sc.nextInt();

		        if (num <= 0) {
		            System.out.println("El número de términos debe ser mayor que cero.");
		        } else {
		            System.out.println("Los primeros " + num + " términos de la secuencia de Fibonacci son:");
		            for (int i = 0; i < num; i++) {
		                System.out.print(fibonacci(i) + " ");
		            }
		        }
		    }

		    public static int fibonacci(int n) {
		        if (n <= 1) {
		            return n;
		        } else {
		            return fibonacci(n - 1) + fibonacci(n - 2);
		        }
		    }
		

	}


