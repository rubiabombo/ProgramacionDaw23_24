package capitulo7.bloque1;

public class Ejercicio01_TablaTiposPrimitivos {
	
	public static void main(String[] args) {
		  System.out.println("Tipo\t\t\tMínimo\t\t\t\tMáximo\t\t\t\tBytes");
	        System.out.println("------------------------------------------------------------");

	        // Tipo byte
	        System.out.println("byte\t\t\t" + Byte.MIN_VALUE + "\t\t\t\t" + Byte.MAX_VALUE + "\t\t\t\t" + Byte.BYTES);

	        // Tipo short
	        System.out.println("short\t\t\t" + Short.MIN_VALUE + "\t\t\t\t" + Short.MAX_VALUE + "\t\t\t\t" + Short.BYTES);

	        // Tipo int
	        System.out.println("int\t\t\t\t" + Integer.MIN_VALUE + "\t\t\t" + Integer.MAX_VALUE + "\t\t\t" + Integer.BYTES);

	        // Tipo long
	        System.out.println("long\t\t\t" + Long.MIN_VALUE + "\t\t" + Long.MAX_VALUE + "\t\t" + Long.BYTES);

	        // Tipo float
	        System.out.println("float\t\t\t" + Float.MIN_VALUE + "\t\t\t\t" + Float.MAX_VALUE + "\t\t\t\t" + Float.BYTES);

	        // Tipo double
	        System.out.println("double\t\t\t" + Double.MIN_VALUE + "\t\t\t" + Double.MAX_VALUE + "\t\t\t" + Double.BYTES);
	}

}
