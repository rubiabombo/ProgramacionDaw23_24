package capitulo5.bloque1.coleccionAntiguedades;

import java.util.Scanner;

public class ColeccionAntiguedades {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Ingrese el tipo de antigüedad (Joya, Libro, Pintura): ");
	        String tipoAntiguedad = sc.nextLine();

	        System.out.println("Ingrese el año de fabricación: ");
	        int anioFabricacion = sc.nextInt();
	        sc.nextLine(); // Consumir la nueva línea después de nextInt()

	        System.out.println("Ingrese el origen: ");
	        String origen = sc.nextLine();

	        System.out.println("Ingrese el precio de venta: ");
	        double precioVenta = sc.nextDouble();
	        sc.nextLine(); // Consumir la nueva línea después de nextDouble()

	        if (tipoAntiguedad.equalsIgnoreCase("Joya")) {
	            System.out.println("Ingrese el material de fabricación: ");
	            String materialFabricacion = sc.nextLine();
	            Joya joya = new Joya(anioFabricacion, origen, precioVenta, materialFabricacion);
	            System.out.println(joya.toString());
	        } else if (tipoAntiguedad.equalsIgnoreCase("Libro")) {
	            System.out.println("Ingrese el autor: ");
	            String autor = sc.nextLine();
	            System.out.println("Ingrese el título: ");
	            String titulo = sc.nextLine();
	            Libro libro = new Libro(anioFabricacion, origen, precioVenta, autor, titulo);
	            System.out.println(libro.toString());
	        } else if (tipoAntiguedad.equalsIgnoreCase("Pintura")) {
	            System.out.println("Ingrese el pintor: ");
	            String pintor = sc.nextLine();
	            System.out.println("Ingrese el estilo: ");
	            String estilo = sc.nextLine();
	            Pintura pintura = new Pintura(anioFabricacion, origen, precioVenta, pintor, estilo);
	            System.out.println(pintura.toString());
	        } else {
	            System.out.println("Tipo de antigüedad no reconocido");
	        }

	        sc.close();
	    }
}
