package capitulo6.bloque1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import utils.Utils;

public class Ejercicio1_ListaInteger {
	public static void main(String[] args) {
		// Declaro variables necesarias
		int opcion;
		List<Integer> lista = new ArrayList<Integer>();

		// Creo una nueva Lista para usarla de Portapapeles
		List<Integer> portapapeles = new ArrayList<Integer>();

		// Bucle principal de la aplicación
		do {
			// Llamo a mostrar el menú y pedir una opción al usuario.
			opcion = menu();

			// Cada caso en función de la opción elegida por el usuario
			switch (opcion) {

			case 0: // Ha elegido abandonar la aplicación
				System.out.println("Au Revoir");
				break;

			case 1:
				creaListaValoresRandom(lista);
				break;

			case 2:
				calcularSumaMediaMinMax(lista);
				break;

			case 3:
				agregaNuevosValores(lista, portapapeles);
				break;

			case 4:
				eliminaElementos(lista);
				break;

			case 5: // Ha elegido visualizar el fichero
				visualizaLista(lista);
				break;

			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 0);

	}

	/**
	 * Muestra un menú en pantalla y pide una opción al usuario
	 * 
	 * @return
	 */
	public static int menu() {
		String strMenu = "\n\nMenú" + "\n0.- Salir" + "\n1.- Crear aleatoriamente la lista de valores"
				+ "\n2.- Calcular suma, media, mayor y menor" + "\n3.- Agregar una cantidad de nuevos valores"
				+ "\n4.- Eliminar elementos cuyo valor esté en un intervalo" + "\n5.- Visualizar el fichero"
				+ "\n\nIntroduzca su opción: ";
		// Muestro el menú y pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}

	/**
	 * Crea una lista con una longitud y con valores al azar entre un mínimo y un
	 * máximo
	 * 
	 * @param lista
	 * @return
	 */
	public static List<Integer> creaListaValoresRandom(List<Integer> lista) {
		
		// Pido la Longitud
		System.out.println("Introduce la Longitud que deseas de la lista: ");
		int longitud = Utils.obtenerEntero();
		
		// Pido el valor mínimo
		System.out.println("Introduce un valor mínimo ");
		int min = Utils.obtenerEntero();
		
		// Pido el valor máximo
		System.out.println("Introduce un valor máximo");
		int max = Utils.obtenerEntero();
		
		// Limpio la lista
		lista.clear();
		
		// Recorro con el valor de la longitud, para darle a la lista los valores
		// aleatorios
		for (int i = 0; i < longitud; i++) {
			lista.add((int) Math.round(Math.random() * (max - min)) + min);
		}
		return lista;
	}

	/**
	 * Calcula la suma, media, mínimo y máximo de una lista
	 * 
	 * @param lista
	 */
	public static void calcularSumaMediaMinMax(List<Integer> lista) {
		
		// Creo las variables que vamos a necesitar para realizar las operaciones
		int num = 0, suma = 0, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		float media = 0;
		
		// Recorro la lista
		for (int i = 0; i < lista.size(); i++) {
			num = lista.get(i); // A la variable num le vamos a dar el valor de cada elemento de la lista
			suma += num; // La variable suma almacenará la suma del valor de num cada vez que este cambie al incrementar la i
			media = (float) suma / lista.size(); // Calculamos la media de la suma de todos los valores entre el tamaño
													// total de la lista
			// Si el elemento de la lista es mayor que la variable mayor (la cual tiene un
			// valor mínimo de entero)
			if (lista.get(i) > mayor) {
				mayor = lista.get(i); // mayor será igual al valor máximo de la lista
			}
			// Si el elemento de la lista es menor que la variable menor (la cual tiene un
			// valor máximo de entero)
			if (lista.get(i) < menor) {
				menor = lista.get(i); // menor será igual al valor mínimo de la lista
			}

		}
		// Saco en pantalla el resultado
		System.out.println("Suma: " + suma + "\nMedia: " + media + "\nMayor: " + mayor + "\nMenor: " + menor);
	}

	/**
	 * Método para agregar nuevos elementos en una posición de una lista, generando
	 * una lista nueva a la que le damos una longitud y unos valores al azar entre
	 * un min - max.
	 * 
	 * @param lista
	 * @param portapapeles
	 * @return
	 */
	public static List<Integer> agregaNuevosValores(List<Integer> lista, List<Integer> portapapeles) {
		
		// Muestro la lista
		visualizaLista(lista);
		
		// Creo una variable para almacenar la longitud de la cantidad de datos
		System.out.println("Introduce la cantidad de datos que quieres agregar: ");
		int cantDatos = Utils.obtenerEntero();
		
		// Creo una variable para almacenar el valor mínimo y máximo
		System.out.println("Introduce un valor mínimo: ");
		int min = Utils.obtenerEntero();
		System.out.println("Introduce un valor máximo: ");
		int max = Utils.obtenerEntero();
		
		// Recorro portapapeles con la longitud de la cantidad de datos
		for (int i = 0; i < cantDatos; i++) {
			portapapeles.add((int) Math.round(Math.random() * (max - min)) + min);
		}
		
		// Creo otra variable que recogerá el número de la posición donde vamos acolocar
		System.out.println("Introduce la posición donde quieres colocar los nuevos elementos: ");
		int posicion = Utils.obtenerEntero();
		// Recorro la lista y le agrego en la posicion, los datos de portapapeles
		for (int i = 0; i < lista.size(); i++) {
			if (i == posicion) {
				lista.addAll(i, portapapeles);
			}
		}
		return lista;
	}

	/**
	 * Método que elimina un rango de elementos en una lista y muestra cuantos han
	 * sido eliminados
	 * 
	 * @param lista
	 */
	public static void eliminaElementos(List<Integer> lista) {
		// Muestro la lista al Usuario
		visualizaLista(lista);
		// Pido los valores mínimo y máximo del intervalo a eliminar
		System.out.println("Introduce el intervalo mínimo: ");
		int min = Utils.obtenerEntero();
		System.out.println("Introduce el intervalo máximo: ");
		int max = Utils.obtenerEntero();
		// Creo una variable contador para saber la cantidad de elementos borrados
		int cont = 0;
		for (int i = min; i <= max; i++) {
			lista.remove(min);
			cont++;
		}
		System.out.println("Los elementos eliminados: " + cont);
	}

	/**
	 * Recorre la lista que simboliza el fichero, exponiendo las líneas en pantalla
	 * y cada una con su número de línea
	 * 
	 * @param lista
	 */
	public static void visualizaLista(List<Integer> lista) {
		System.out.println("\n\nContenido de la lista");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}

	}
	
}
