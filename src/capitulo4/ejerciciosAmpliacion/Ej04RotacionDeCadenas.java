package capitulo4.ejerciciosAmpliacion;

public class Ej04RotacionDeCadenas {

	public static boolean esRotacion(String cadena1, String cadena2) {
		// Verifica si las cadenas tienen la misma longitud y no son nulas
		if (cadena1 == null || cadena2 == null || cadena1.length() != cadena2.length()) {
			return false;
		}

		// Concatena la cadena original consigo misma
		String cadenaConcatenada = cadena1 + cadena1;

		// Verifica si la cadena objetivo está contenida en la cadena concatenada
		return cadenaConcatenada.contains(cadena2);
	}

	public static void main(String[] args) {
		String cadena1 = "abcde";
		String cadena2 = "cdeab";

		if (esRotacion(cadena1, cadena2)) {
			System.out.println(cadena2 + " es una rotación de " + cadena1);
		} else {
			System.out.println(cadena2 + " no es una rotación de " + cadena1);
		}
	}

}
