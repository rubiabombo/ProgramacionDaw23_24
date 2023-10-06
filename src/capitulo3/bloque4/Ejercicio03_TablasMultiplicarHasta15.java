package capitulo3.bloque4;

public class Ejercicio03_TablasMultiplicarHasta15 {

	public static void main(String[] args) {
		int num = 1, factor;
		
		while (num <= 15) {
			factor = 1;
			System.out.println("\nTabla de multiplicar del " + num );
			
			while (factor <= 10) {
				System.out.println("\t" + num + " x " + factor + " = " + (num * factor));
				factor++;
			}
			num++;
		}
		

	}

}
