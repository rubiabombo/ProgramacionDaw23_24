package capitulo7.bloque2;

public class Ejercicio02_NumeroPi {

	public static void main(String[] args) {
		
		double pi = 4; // creamos variable para el número pi
		double num = 4;
		double den = 3;


		do {
			//Realizamos operaciones
			pi = pi - (num/den);			

			num = num * -1; //Cambiamos signo para siguiente vuelta del bucle
			den += 2;//Aumentamos denominador para continuar con la serie


		} while (pi <= Math.PI - 0.00001 || pi >= Math.PI); // Salimos del bucle cuando tengamos un error menos al 0.00001
		

		System.out.println("El número pi es: " + pi);
	}
}


