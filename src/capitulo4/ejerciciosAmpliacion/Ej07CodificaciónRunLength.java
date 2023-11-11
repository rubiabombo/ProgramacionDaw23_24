package capitulo4.ejerciciosAmpliacion;

public class Ej07CodificaciónRunLength {

	  public static String comprimirRunLength(String s) {
	        if (s == null || s.isEmpty()) {
	            return "";
	        }

	        StringBuilder result = new StringBuilder();
	        char currentChar = s.charAt(0);
	        int count = 1;

	        for (int i = 1; i < s.length(); i++) {
	            if (s.charAt(i) == currentChar) {
	                count++;
	            } else {
	                result.append(count).append(currentChar);
	                currentChar = s.charAt(i);
	                count = 1;
	            }
	        }

	        result.append(count).append(currentChar);

	        return result.toString();
	    }

	    public static String descomprimirRunLength(String s) {
	        if (s == null || s.isEmpty()) {
	            return "";
	        }

	        StringBuilder result = new StringBuilder();
	        int i = 0;

	        while (i < s.length()) {
	            int count = 0;
	            while (i < s.length() && Character.isDigit(s.charAt(i))) {
	                count = count * 10 + Character.getNumericValue(s.charAt(i));
	                i++;
	            }

	            if (i < s.length()) {
	                char character = s.charAt(i);
	                for (int j = 0; j < count; j++) {
	                    result.append(character);
	                }
	                i++;
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        String original = "AAAABBBCCDAA";
	        String comprimida = comprimirRunLength(original);
	        String descomprimida = descomprimirRunLength(comprimida);

	        System.out.println("Original: " + original);
	        System.out.println("Comprimida: " + comprimida);
	        System.out.println("Descomprimida: " + descomprimida);
	    }

	}


