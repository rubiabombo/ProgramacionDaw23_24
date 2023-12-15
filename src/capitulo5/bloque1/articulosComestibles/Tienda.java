package capitulo5.bloque1.articulosComestibles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import utils.Utils;



//Clase principal que contiene el método main
public class Tienda {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Crear cuatro artículos (dos perecederos y dos no perecederos)
     Articulo articulo1 = crearArticulo(scanner);
     Articulo articulo2 = crearArticulo(scanner);
     Articulo articulo3 = crearArticulo(scanner);
     Articulo articulo4 = crearArticulo(scanner);

     // Imprimir la información de los artículos
     System.out.println("Información del artículo 1:");
     articulo1.mostrarInformacion();

     System.out.println("\nInformación del artículo 2:");
     articulo2.mostrarInformacion();

     System.out.println("\nInformación del artículo 3:");
     articulo3.mostrarInformacion();

     System.out.println("\nInformación del artículo 4:");
     articulo4.mostrarInformacion();

     scanner.close();
 }

 private static Articulo crearArticulo(Scanner sc) {
     System.out.println("Ingrese los datos del artículo:");
     System.out.print("Código: ");
     int codigo = sc.nextInt();
     sc.nextLine(); // Consumir la nueva línea pendiente
     System.out.print("Nombre: ");
     String nombre = sc.nextLine();
     System.out.print("Precio: $");
     double precio = sc.nextDouble();

     System.out.println("¿Es perecedero? (1: Sí, 2: No): ");
     int tipoArticulo = sc.nextInt();
     sc.nextLine(); // Consumir la nueva línea pendiente

     if (tipoArticulo == 1) {
         System.out.print("Fecha de caducidad (Formato: dd/mm/yyyy): ");
         String fechaCaducidad = sc.nextLine();
         return new Perecedero(codigo, nombre, precio, fechaCaducidad);
     } else {
         return new NoPerecedero(codigo, nombre, precio);
     }
 }
}