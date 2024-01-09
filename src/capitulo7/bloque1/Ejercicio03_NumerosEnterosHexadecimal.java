package capitulo7.bloque1;

public class Ejercicio03_NumerosEnterosHexadecimal {

	public static void main(String[] args) {
		//Imprime los primeros 100 números enteros en formato hexadecimal
		for ( int i = 1; i <= 100; i++) {
			String hex = Integer.toHexString(i);
			
			System.out.println("Número " + i + " rn hexadecimal: 0x" + hex);
		}

	}

}
