package capitulo6.bloque2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GestionAlmacen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Articulo> almacen = new HashMap<>();
       

        int opcion;

        do {
        	String input = JOptionPane.showInputDialog(
                    "-------- Menú --------\n" +
                            "0.- Salir\n" +
                            "1.- Lista de artículos\n" +
                            "2.- Crear un nuevo artículo\n" +
                            "3.- Eliminar un artículo\n" +
                            "4.- Actualizar un artículo\n" +
                            "Ingrese la opción:");

            opcion = Integer.parseInt(input);
            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                case 1:
                    listarArticulos(almacen);
                    break;
                case 2:
                    crearArticulo(sc, almacen);
                    break;
                case 3:
                    eliminarArticulo(sc, almacen);
                    break;
                case 4:
                    actualizarArticulo(sc, almacen);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 0);
        
        sc.close();
    }

    private static void listarArticulos(Map<String, Articulo> almacen) {
        System.out.println("-------- Lista de Artículos --------");
        for (Map.Entry<String, Articulo> entry : almacen.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("-----------------------------------");
    }

    private static void crearArticulo(Scanner scanner, Map<String, Articulo> almacen) {
        System.out.print("Ingrese el código de barras del nuevo artículo: ");
        String codigoBarras = scanner.nextLine();

        System.out.print("Ingrese el número de estante del nuevo artículo: ");
        int numeroEstante = scanner.nextInt();
        
        System.out.print("Ingrese la cantidad de unidades en stock del nuevo artículo: ");
        int cantidadStock = scanner.nextInt();

        Articulo nuevoArticulo = new Articulo(codigoBarras, numeroEstante, cantidadStock);
        almacen.put(codigoBarras, nuevoArticulo);

        System.out.println("Artículo añadido correctamente.");
    }

    private static void eliminarArticulo(Scanner scanner, Map<String, Articulo> almacen) {
        System.out.print("Ingrese el código de barras del artículo a eliminar: ");
        String codigoBarras = scanner.nextLine();

        if (almacen.containsKey(codigoBarras)) {
            almacen.remove(codigoBarras);
            System.out.println("Artículo eliminado correctamente.");
        } else {
            System.out.println("No se encontró el artículo con ese código de barras.");
        }
    }

    private static void actualizarArticulo(Scanner scanner, Map<String, Articulo> almacen) {
        System.out.print("Ingrese el código de barras del artículo a actualizar: ");
        String codigoBarras = scanner.nextLine();

        if (almacen.containsKey(codigoBarras)) {
            System.out.print("Ingrese el nuevo número de estante: ");
            int nuevoEstante = scanner.nextInt();
            
            System.out.print("Ingrese la nueva cantidad de unidades en stock: ");
            int nuevaCantidad = scanner.nextInt();

            Articulo articuloActualizado = almacen.get(codigoBarras);
            articuloActualizado.setNumeroEstante(nuevoEstante);
            articuloActualizado.setCantidadStock(nuevaCantidad);

            System.out.println("Artículo actualizado correctamente.");
        } else {
            System.out.println("No se encontró el artículo con ese código de barras.");
        }
    }
}

class Articulo {
    private String codigoBarras;
    private int numeroEstante;
    private int cantidadStock;

    public Articulo(String codigoBarras, int numeroEstante, int cantidadStock) {
        this.codigoBarras = codigoBarras;
        this.numeroEstante = numeroEstante;
        this.cantidadStock = cantidadStock;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public int getNumeroEstante() {
        return numeroEstante;
    }

    public void setNumeroEstante(int numeroEstante) {
        this.numeroEstante = numeroEstante;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return "Artículo{" +
                "Código de barras='" + codigoBarras + '\'' +
                ", Número de estante=" + numeroEstante +
                ", Cantidad en stock=" + cantidadStock +
                '}';
    }
}