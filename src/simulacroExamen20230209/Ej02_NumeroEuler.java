package simulacroExamen20230209;

public class Ej02_NumeroEuler {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double euler = 0;
		
		for (int i = 0; i < 15; i++) {
			euler += 1d / factorial(i);
		}
		System.out.println("Número E: " + euler);
	}

	//Metodo para sacar el factorial del numero E
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int factorial (int n) {
		if (n == 0) {
			return 1;
		}
		else {
			for (int i = n-1; i > 1; i--) {
				n = n * i;
			}
			
			return n;
		}
	}

}
