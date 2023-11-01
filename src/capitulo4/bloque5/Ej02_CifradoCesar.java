package capitulo4.bloque5;

public class Ej02_CifradoCesar {

		public static String cifradoCesar(String texto, int desplazamiento) {
	        StringBuilder resultado = new StringBuilder();
	        
	        for (int i = 0; i < texto.length(); i++) {
	            char caracter = texto.charAt(i);
	            
	            if (Character.isLetter(caracter)) {
	                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
	                caracter = (char)(((caracter - base + desplazamiento) % 26) + base);
	            }
	            
	            resultado.append(caracter);
	        }
	        
	        return resultado.toString();
	    }

	    public static void main(String[] args) {
	        String mensaje = "hola";
	        int desplazamiento = 3;
	        String mensajeCifrado = cifradoCesar(mensaje, desplazamiento);
	        
	        System.out.println("Mensaje original: " + mensaje);
	        System.out.println("Mensaje cifrado: " + mensajeCifrado);

	}

}
