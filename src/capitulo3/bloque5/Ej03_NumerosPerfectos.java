package capitulo3.bloque5;

public class Ej03_NumerosPerfectos {

	public static void main(String[] args) {
		
		 int limiteSuperior = 1000; // Cambia este valor según tu rango deseado
	        
	        System.out.println("Números perfectos en el rango de 1 a " + limiteSuperior + ":");
	        
	        for (int i = 1; i <= limiteSuperior; i++) {
	            if (esNumeroPerfecto(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	    
	    public static boolean esNumeroPerfecto(int numero) {
	        int sumaDivisores = 0;
	        
	        for (int i = 1; i < numero; i++) {
	            if (numero % i == 0) {
	                sumaDivisores += i;
	            }
	        }
	        
	        return sumaDivisores == numero;
	    }

	}



