package capitulo6.bloque2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionAlmacen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, Articulo> almacen = new HashMap<>();

		int opcion;
		do {
			mostrarMenu();
			System.out.print("Ingrese su opción: ");
			opcion = sc.nextInt();
			sc.nextLine(); // Consumir el salto de línea después del número

			switch (opcion) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				mostrarListaArticulos(almacen);
				break;
			case 2:
				crearNuevoArticulo(sc, almacen);
				break;
			case 3:
				eliminarArticulo(sc, almacen);
				break;
			case 4:
				actualizarArticulo(sc, almacen);
				break;
			default:
				System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
			}

		} while (opcion != 0);

		sc.close();
	}

	private static void mostrarMenu() {
		System.out.println("\n-- Menú --");
		System.out.println("0.- Salir");
		System.out.println("1.- Lista de artículos");
		System.out.println("2.- Crear un nuevo artículo");
		System.out.println("3.- Eliminar un artículo");
		System.out.println("4.- Actualizar un artículo");
	}

	private static void mostrarListaArticulos(Map<String, Articulo> almacen) {
		if (almacen.isEmpty()) {
			System.out.println("El almacén está vacío.");
		} else {
			System.out.println("\nLista de artículos:");
			for (Map.Entry<String, Articulo> entry : almacen.entrySet()) {
				System.out.println(entry.getValue());
			}
		}
	}

	private static void crearNuevoArticulo(Scanner scanner, Map<String, Articulo> almacen) {
		System.out.print("Ingrese el código de barras: ");
		String codigoBarras = scanner.nextLine();

		System.out.print("Ingrese el número de estante: ");
		int numeroEstante = scanner.nextInt();

		System.out.print("Ingrese la cantidad de unidades en stock: ");
		int cantidadStock = scanner.nextInt();

		Articulo nuevoArticulo = new Articulo(codigoBarras, numeroEstante, cantidadStock);
		almacen.put(codigoBarras, nuevoArticulo);

		System.out.println("Artículo agregado correctamente.");
	}

	private static void eliminarArticulo(Scanner sc, Map<String, Articulo> almacen) {
		System.out.print("Ingrese el código de barras del artículo a eliminar: ");
		String codigoBarras = sc.nextLine();

		if (almacen.containsKey(codigoBarras)) {
			almacen.remove(codigoBarras);
			System.out.println("Artículo eliminado correctamente.");
		} else {
			System.out.println("No se encontró ningún artículo con el código de barras proporcionado.");
		}
	}

	private static void actualizarArticulo(Scanner sc, Map<String, Articulo> almacen) {
		System.out.print("Ingrese el código de barras del artículo a actualizar: ");
		String codigoBarras = sc.nextLine();

		if (almacen.containsKey(codigoBarras)) {
			System.out.print("Ingrese el nuevo número de estante: ");
			int nuevoEstante = sc.nextInt();

			System.out.print("Ingrese la nueva cantidad de unidades en stock: ");
			int nuevaCantidadStock = sc.nextInt();

			Articulo articulo = almacen.get(codigoBarras);
			articulo.setNumeroEstante(nuevoEstante);
			articulo.setCantidadStock(nuevaCantidadStock);

			System.out.println("Artículo actualizado correctamente.");
		} else {
			System.out.println("No se encontró ningún artículo con el código de barras proporcionado.");
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
		return "Artículo{" + "Código de Barras='" + codigoBarras + '\'' + ", Número de Estante=" + numeroEstante
				+ ", Cantidad en Stock=" + cantidadStock + '}';
	}
}
