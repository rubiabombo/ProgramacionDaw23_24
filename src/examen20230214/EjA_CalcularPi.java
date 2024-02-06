package examen20230214;

public class EjA_CalcularPi {
	  public static void main(String[] args) {
		  int terminos = 7;
		  double resultadoPi = calcularPi(terminos);
		  System.out.println("Valor estimado de pi con "  + terminos + " términos: " + resultadoPi);
	  }

	public static double calcularPi(int n) {
		double pi = 3.0;
		boolean sumar = false;
		
		for ( int i = 2; i<= n*2; i +=2) {
			double termino = 4.0 / (i * (i + 1) * (i + 2));
			
			 if (sumar) {
				 pi += termino;
			 }else {
				 pi -= termino;
			 }
			 sumar = !sumar;
		}
		return pi;
	}

}
