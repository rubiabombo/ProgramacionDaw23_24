package examen20230214.cromoBaloncesto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestorCromos{
	 private Map<Integer, CromoBaloncesto> cromos;

	    public GestorCromos() {
	        this.cromos = new HashMap<>();
	    }

	    public void ejecutarMenu() {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nMenú:");
	            System.out.println("0.- Abandonar el programa.");
	            System.out.println("1.- Visualizar los valores de todos los cromos guardados.");
	            System.out.println("2.- Introducir un nuevo cromo guardado.");
	            System.out.println("3.- Eliminar un cromo, especificando su id numérico.");
	            System.out.println("4.- Imprimir en consola los datos del jugador con más puntos obtenidos.");
	            System.out.println("5.- Modificar los valores de un jugador concreto.");
	            System.out.println("6.- Imprimir en consola los datos del jugador con menos rebotes.");

	            System.out.print("Ingrese la opción: ");
	            int opcion = scanner.nextInt();

	            switch (opcion) {
	                case 0:
	                    System.out.println("¡Hasta luego!");
	                    System.exit(0);
	                    break;
	                case 1:
	                    visualizarCromos();
	                    break;
	                case 2:
	                    introducirCromo(scanner);
	                    break;
	                case 3:
	                    eliminarCromo(scanner);
	                    break;
	                case 4:
	                    jugadorConMasPuntos();
	                    break;
	                case 5:
	                    modificarValores(scanner);
	                    break;
	                case 6:
	                    jugadorConMenosRebotes();
	                    break;
	                default:
	                    System.out.println("Opción no válida. Inténtelo de nuevo.");
	            }
	        }
	    }

	    private void visualizarCromos() {
	        System.out.println("\nCromos guardados:");
	        for (CromoBaloncesto cromo : cromos.values()) {
	            System.out.println("ID: " + cromo.getId() +
	                    ", Nombre: " + cromo.getNombre() +
	                    ", Puntos: " + cromo.getPuntos() +
	                    ", Rebotes: " + cromo.getRebotes());
	        }
	    }

	    private void introducirCromo(Scanner scanner) {
	        System.out.print("Ingrese el ID del nuevo cromo: ");
	        int id = scanner.nextInt();
	        System.out.print("Ingrese el nombre del jugador: ");
	        String nombre = scanner.next();
	        System.out.print("Ingrese los puntos del jugador en la temporada pasada: ");
	        int puntos = scanner.nextInt();
	        System.out.print("Ingrese los rebotes del jugador en la temporada pasada: ");
	        int rebotes = scanner.nextInt();

	        CromoBaloncesto nuevoCromo = new CromoBaloncesto(id, nombre, puntos, rebotes);
	        cromos.put(id, nuevoCromo);

	        System.out.println("Nuevo cromo agregado con éxito.");
	    }

	    private void eliminarCromo(Scanner scanner) {
	        System.out.print("Ingrese el ID del cromo a eliminar: ");
	        int idEliminar = scanner.nextInt();

	        if (cromos.containsKey(idEliminar)) {
	            cromos.remove(idEliminar);
	            System.out.println("Cromo eliminado con éxito.");
	        } else {
	            System.out.println("No se encontró ningún cromo con el ID proporcionado.");
	        }
	    }

	    private void jugadorConMasPuntos() {
	        CromoBaloncesto maxPuntos = null;

	        for (CromoBaloncesto cromo : cromos.values()) {
	            if (maxPuntos == null || cromo.getPuntos() > maxPuntos.getPuntos()) {
	                maxPuntos = cromo;
	            }
	        }

	        if (maxPuntos != null) {
	            System.out.println("Jugador con más puntos: " + maxPuntos.getNombre() +
	                    ", Puntos: " + maxPuntos.getPuntos());
	        } else {
	            System.out.println("No hay cromos para mostrar.");
	        }
	    }

	    private void modificarValores(Scanner scanner) {
	        System.out.print("Ingrese el ID del jugador a modificar: ");
	        int idModificar = scanner.nextInt();

	        if (cromos.containsKey(idModificar)) {
	            System.out.print("Ingrese los nuevos puntos del jugador: ");
	            int nuevosPuntos = scanner.nextInt();
	            System.out.print("Ingrese los nuevos rebotes del jugador: ");
	            int nuevosRebotes = scanner.nextInt();

	            CromoBaloncesto cromoModificar = cromos.get(idModificar);
	            cromoModificar.setPuntos(nuevosPuntos);
	            cromoModificar.setRebotes(nuevosRebotes);

	            System.out.println("Valores del jugador modificados con éxito.");
	        } else {
	            System.out.println("No se encontró ningún cromo con el ID proporcionado.");
	        }
	    }

	    private void jugadorConMenosRebotes() {
	        CromoBaloncesto minRebotes = null;

	        for (CromoBaloncesto cromo : cromos.values()) {
	            if (minRebotes == null || cromo.getRebotes() < minRebotes.getRebotes()) {
	                minRebotes = cromo;
	            }
	        }

	        if (minRebotes != null) {
	            System.out.println("Jugador con menos rebotes: " + minRebotes.getNombre() +
	                    ", Rebotes: " + minRebotes.getRebotes());
	        } else {
	            System.out.println("No hay cromos para mostrar.");
	        }
	    }

	    public static void main(String[] args) {
	        GestorCromos gestor = new GestorCromos();
	        gestor.ejecutarMenu();
	    }




}
