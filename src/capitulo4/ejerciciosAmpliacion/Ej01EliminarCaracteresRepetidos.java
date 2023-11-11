package capitulo4.ejerciciosAmpliacion;

public class Ej01EliminarCaracteresRepetidos {

	public static void main(String[] args) {
		String input = "hola mundo";
        String result = removeDuplicates(input);
        System.out.println("Cadena original: " + input);
        System.out.println("Cadena sin caracteres duplicados: " + result);
    }

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
		

	}

}
