package capitulo4.bloque5;

public class Ej01_EliminarEspaciosEnBlanco {

	public static void main(String[] args) {
		String cadenaConEspacios = "Hola, este es un ejemplo de cadena con espacios en blanco.";
        String cadenaSinEspacios = eliminarEspaciosEnBlanco(cadenaConEspacios);
        
        System.out.println("Cadena original: " + cadenaConEspacios);
        System.out.println("Cadena sin espacios en blanco: " + cadenaSinEspacios);
    }

    public static String eliminarEspaciosEnBlanco(String cadena) {
        // Utilizamos el método replaceAll() con una expresión regular para reemplazar todos los espacios en blanco por una cadena vacía.
        return cadena.replaceAll("\\s", "");

	}

}
