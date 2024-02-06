package examen20230214;

public class EjC_ProcesarString {
	public static void main(String[] args) {
        // Establecemos el String directamente para ahorrar tiempo
        String inputString = "    123 AbCdEf 456 GhiJkL 789 MnoPqRs!   ";

        // Eliminamos los espacios en blanco del principio del String
        inputString = inputString.trim();

        // Dividimos el String en un array de palabras
        String[] palabras = inputString.split("\\s+");

        // Procesamos cada palabra
        for (String palabra : palabras) {
            System.out.println("Palabra: " + palabra);
            procesarPalabra(palabra);
            System.out.println();
        }
    }

    private static void procesarPalabra(String palabra) {
        int letrasMayusculas = 0;
        int letrasMinusculas = 0;
        int digitos = 0;
        int caracteresNoAlfanumericos = 0;

        // Contamos las letras mayúsculas, minúsculas, dígitos y caracteres no alfanuméricos
        for (char caracter : palabra.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                letrasMayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                letrasMinusculas++;
            } else if (Character.isDigit(caracter)) {
                digitos++;
            } else if (!Character.isLetterOrDigit(caracter)) {
                caracteresNoAlfanumericos++;
            }
        }

        // Mostramos los resultados
        System.out.println("Letras mayúsculas: " + letrasMayusculas);
        System.out.println("Letras minúsculas: " + letrasMinusculas);
        System.out.println("Dígitos: " + digitos);
        System.out.println("Caracteres no alfanuméricos: " + caracteresNoAlfanumericos);

        // Mostramos las palabras que tienen al menos 3 caracteres no alfanuméricos
        if (caracteresNoAlfanumericos >= 3) {
            System.out.println("Palabra con al menos 3 caracteres no alfanuméricos: " + palabra);
        }
    }
}
