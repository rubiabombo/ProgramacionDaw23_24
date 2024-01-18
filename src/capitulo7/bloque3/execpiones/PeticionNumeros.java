package capitulo7.bloque3.execpiones;

import java.util.Scanner;

public class PeticionNumeros {

	public static void main(String[] args) {
		try {
			
			System.out.println(pideNumeroPar() + " es un número par");
			
		} catch (OddNumberException e) {
			
			e.printStackTrace();
		}

	}

	private static int pideNumeroPar() throws OddNumberException{
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Introduce un número par: ");
		num = sc.nextInt();
		if(num%2 == 1) throw new OddNumberException("Error: el número introducido es impar");
		return num;
	}

}
