package capitulo7.bloque2;

public class Ejercicio02_NumeroPi {

	public static void main(String[] args) {
		double pi = 0;
		int x = 1;
		int cont = 0;
		do {
			if(cont%2 == 0) pi += 4/(double) x;
			else pi += - 4/(double) x;
			x = x+2;
			System.out.println(pi);
			System.out.println(x);
			cont++;
			
		}while(Math.abs(pi-Math.PI) >= 0.0001);
		
		System.out.println(pi);
	}
}


