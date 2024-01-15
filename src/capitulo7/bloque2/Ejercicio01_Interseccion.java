package capitulo7.bloque2;

public class Ejercicio01_Interseccion {
	
	public static void main(String[] args) {
		float x = 0;
		double y1, y2;
		System.out.println("Unión y=√x, y=-ln(x) ");
		do {

			x += 0.0001;
			y1 = Math.sqrt(x);
			y2 = -Math.log(x);

		} while (Math.abs(y1 - y2) >= 0.0001);

		System.out.println("x: " + x);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
	}

}

