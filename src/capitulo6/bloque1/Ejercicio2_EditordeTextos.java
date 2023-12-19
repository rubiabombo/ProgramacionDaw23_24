package capitulo6.bloque1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import utils.Utils;

public class Ejercicio2_EditordeTextos {
	public static void main(String[] args) {
		// Declaro variables necesarias
		int opcion;
		List<String> fichero = new ArrayList<String>();

		// Creo una nueva Lista para usarla de Portapapeles
		List<String> listaPortapapeles = new ArrayList<String>();

		// Bucle principal de la aplicación
		do {
			// Llamo a mostrar el menú y pedir una opción al usuario.
			opcion = menu();

			// Cada caso en función de la opción elegida por el usuario
			switch (opcion) {

			case 0: // Ha elegido abandonar la aplicación
				System.out.println("Adios!");
				break;

			case 1:
				addLine(fichero);
				break;

			case 2:
				insertPosition(fichero);
				break;

			case 3:
				editLine(fichero);
				break;

			case 4:
				deleteLine(fichero);
				break;

			case 5:
				cutLines(fichero, listaPortapapeles);
				break;

			case 6:
				pasteLines(fichero, listaPortapapeles);
				break;

			case 7: // Ha elegido visualizar el fichero
				visualizaLista(fichero);
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
		String strMenu = "\n\nMenú" + "\n0.- Salir" + "\n1.- Agregar una línea"
				+ "\n2.- Insertar una línea en una posición" + "\n3.- Editar una línea" + "\n4.- Eliminar una línea"
				+ "\n5.- Cortar un conjunto de líneas" + "\n6.- Pegar un conjunto de líneas"
				+ "\n7.- Visualizar el fichero" + "\n\nIntroduzca su opción: ";
		// Muestro el menú y pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}

	/**
	 * Método que recoge una Lista, Pide al usuario introducir un texto y devuelve
	 * la lista
	 * 
	 * @param fichero
	 * @return
	 */
	public static List<String> addLine(List<String> fichero) {
		// Pedimos al usuario que introduzca un texto
		System.out.println("Por favor introduzca un texto: ");
		// Creamos una variable String y le aplicamos el método obtenerString, para
		// poder escribir las líneas
		String linea = Utils.obtenerStringPorScanner();
		// Añadimos la línea
		fichero.add(linea);
		return fichero;
	}

	/**
	 * Método que recoge una Lista, Pide al usuario introducir un texto y una
	 * posición donde colocarlo y devuelve la lista
	 * 
	 * @param fichero
	 * @return
	 */
	public static List<String> insertPosition(List<String> fichero) {
		// Pedimos al usuario que introduzca un texto
		System.out.println("Por favor introduzca un texto: ");
		// Creamos una variable String y le aplicamos el método obtenerString, para
		// poder escribir las líneas
		String lineaInsertada = Utils.obtenerStringPorScanner();
		// Pido al usuario un entero para colocar la línea
		System.out.println("Introduce en que número de línea quieres insertar la nueva: ");
		int posicionLinea = Utils.obtenerEntero(); // Le doy el valor del método obtenerEntero

		// Recorro la lista
		for (int i = 0; i < fichero.size(); i++) {
			if (i == posicionLinea) { // Si i es igual al número de la posición de la línea
				fichero.add(posicionLinea, lineaInsertada); // añado el texto a la posición indicada
			}
		}
		return fichero;

	}

	/**
	 * Método que recoge una Lista. Visualiza la lista, pide al usuario un número de
	 * linea, remueve la linea, añade nueva linea en la posición removida y devuelve
	 * la lista.
	 * 
	 * @param fichero
	 * @return
	 */
	public static List<String> editLine(List<String> fichero) {
		// Primero muestro las lineas para que el usuario nos indique cual desea
		// modificar
		visualizaLista(fichero);
		// Pedimos al usuario que línea desea modificar
		System.out.println("Por favor indique que línea desea modificar");
		// Creamos la variable que almacene el número de línea
		int numLinea = Utils.obtenerEntero();
		// Removemos la línea que ha indicado el usuario
		fichero.remove(numLinea);
		// Pedimos al usuario que introduzca un nuevo texto
		System.out.println("Por favor introduzca el nuevo texto: ");
		String nuevoTexto = Utils.obtenerStringPorScanner();
		// Añadimos el nuevo texto a la línea que removimos
		fichero.add(numLinea, nuevoTexto);
		return fichero;
	}

	/**
	 * Método que recoge una lista. Visualiza la lista, pide al usuario un número de
	 * linea, remueve la linea y devuelve la lista.
	 * 
	 * @param fichero
	 * @return
	 */
	public static List<String> deleteLine(List<String> fichero) {
		// Muestro la Lista
		visualizaLista(fichero);
		// Pedimos al usuario que línea desea modificar
		System.out.println("Por favor indique que línea desea modificar");
		// Creamos la variable que almacene el número de línea
		int numLinea = Utils.obtenerEntero();
		// Removemos la línea que ha indicado el usuario
		fichero.remove(numLinea);
		return fichero;
	}

	/**
	 * Método que corta un rango de lineas de una lista y las guarda en una nueva
	 * lista de portapapeles
	 * 
	 * @param fichero
	 * @param listaPortapapeles
	 */

	public static void cutLines(List<String> fichero, List<String> listaPortapapeles) {
		// Muestro la Lista
		visualizaLista(fichero);
		// Pido el número de linea de inicio
		System.out.println("Introduce el número de línea de inicio: ");
		int linIni = Utils.obtenerEntero();
		// Pido el número de línea de fin
		System.out.println("Introduce el número de línea de fin: ");
		int linFin = Utils.obtenerEntero();
		// Limpio la lista portapapeles antes de copiar los valores
		listaPortapapeles.clear();
		// Recorro desde la linea Inicial hasta la linea Final
		for (int i = linIni; i <= linFin; i++) {
			// Añado a listaPortapapeles los elementos de fichero de con la posicion de
			// linIni, ya que luego al removerlos de fichero el elemento que está en la
			// posición de linIni, tomará el valor que se ha desplazado de la posicion
			// porsterior hasta la posición de linIni.
			listaPortapapeles.add(fichero.get(linIni));
			// Remuevo de la lista fichero los valores de la posición de linIni
			fichero.remove(linIni); // Remuevo el elemento de la posición de linIni, tantas veces hasta que i se
									// menor o igual a linFin
		}
	}
	/**
	 * Método que pega los valores que están almacenados en portapapeles, en una
	 * lista, en la posicion indicada
	 * 
	 * @param fichero
	 * @param listaPortapapeles
	 */
	public static void pasteLines(List<String> fichero, List<String> listaPortapapeles) {
		// Muestro la lista en su estado actual
		visualizaLista(fichero);
		// Pido el número de posición donde quiero pegar la lista
		System.out.println("Por favor indique en que posión de la lista desea pegar: ");
		int posicion = Utils.obtenerEntero();
		// Recorro la lista donde voy a pegar los valores de la lista portapapeles
		for (int i = 0; i <= fichero.size(); i++) {
			if (i == posicion) { // Cuando la i se igual a la posición que ha indicado el usuario
				fichero.addAll(i, listaPortapapeles); // Añadimos a la lista Fichero los valores de la lista
														// portapapeles
			}
		}
	}

	/**
	 * Recorre la lista que simboliza el fichero, exponiendo las líneas en pantalla
	 * y cada una con su número de línea
	 * 
	 * @param lista
	 */
	public static void visualizaLista(List<String> lista) {
		System.out.println("\n\nContenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}

	}

}

