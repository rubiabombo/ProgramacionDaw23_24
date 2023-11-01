package capitulo4.bloque5;

public class Ej04_PalabraMasLarga {

	 public static String findLongestWord(String input) {
	        // Dividir la cadena en palabras usando un espacio como delimitador
	        String[] words = input.split(" ");
	        
	        // Inicializar una variable para almacenar la palabra más larga
	        String longestWord = "";
	        
	        // Recorrer todas las palabras en la cadena
	        for (String word : words) {
	            // Si la longitud de la palabra actual es mayor que la longitud de la palabra más larga encontrada hasta ahora
	            if (word.length() > longestWord.length()) {
	                longestWord = word; // Actualizar la palabra más larga
	            }
	        }
	        
	        return longestWord;
	    }
	    
	    public static void main(String[] args) {
	        String input = "Esta es una cadena de ejemplo para encontrar la palabra más larga";
	        String longestWord = findLongestWord(input);
	        System.out.println("La palabra más larga es: " + longestWord);
		

	}

}
