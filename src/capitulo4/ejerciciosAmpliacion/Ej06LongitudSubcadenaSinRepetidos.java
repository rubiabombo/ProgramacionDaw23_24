package capitulo4.ejerciciosAmpliacion;

import java.util.HashSet;

public class Ej06LongitudSubcadenaSinRepetidos {


    public static int longitudSubcadenaSinRepetidos(String s) {
        int n = s.length();
        int left = 0, right = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        while (right < n) {
            char currentChar = s.charAt(right);
            if (!charSet.contains(currentChar)) {
                charSet.add(currentChar);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                charSet.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";

        int result1 = longitudSubcadenaSinRepetidos(s1);
        int result2 = longitudSubcadenaSinRepetidos(s2);

        System.out.println("Longitud de la subcadena más larga sin caracteres repetidos en s1: " + result1); // Debería ser 3
        System.out.println("Longitud de la subcadena más larga sin caracteres repetidos en s2: " + result2); // Debería ser 1
    }
		

	}


