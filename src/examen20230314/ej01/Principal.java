package examen20230314.ej01;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
        CajaSupermercado caja = new CajaSupermercado();
        Scanner sc= new Scanner(System.in);

        System.out.println("Bienvenido al supermercado!");

        // Agregar productos al carrito
        caja.agregarProducto("Manzanas", 2);
        caja.agregarProducto("Pan", 3);
        caja.agregarProducto("Leche", 1);

        // Mostrar carrito y calcular total
        System.out.println("Carrito actual:");
        caja.calcularTotal();

        // Eliminar un producto
        System.out.print("¿Desea eliminar algún producto? (Ingrese el nombre del producto o 'no'): ");
        String productoEliminar = sc.nextLine();
        if (!productoEliminar.equalsIgnoreCase("no")) {
            caja.eliminarProducto(productoEliminar);
            // Mostrar carrito y calcular total después de eliminar producto
            System.out.println("Carrito actual después de eliminar " + productoEliminar + ":");
            caja.calcularTotal();
        }

        // Pago
        try {
            System.out.print("Ingrese la cantidad a abonar: ");
            double cantidadAbonada = sc.nextDouble();
            caja.pagar(cantidadAbonada);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}