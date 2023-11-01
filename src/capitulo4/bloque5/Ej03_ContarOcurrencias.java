package capitulo4.bloque5;

public class Ej03_ContarOcurrencias {

	
		public static int contarOcurrencias(String cadena, String subcadena) {
	        int contador = 0;
	        int indice = 0;

	        while ((indice = cadena.indexOf(subcadena, indice)) != -1) {
	            contador++;
	            indice += subcadena.length();
	        }

	        return contador;
	    }

	    public static void main(String[] args) {
	        String cadena = "Esta es una cadena de ejemplo con una subcadena de ejemplo.";
	        String subcadena = "ejemplo";
	        int resultado = contarOcurrencias(cadena, subcadena);
	        System.out.println("La subcadena '" + subcadena + "' aparece " + resultado + " veces en la cadena.");
	}

}
