package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Utils {
	/**
	 * Método que obtiene y devuelve un número al azar, entre 0 y 100.
	 * @return Número generado al azar entre 0 y 100
	 */
	public static int obtenerNumeroAzar () {
		 return (int) Math.round(Math.random() * 100);
	}
	

	/**
	 * 
	 * @param min Límite inferior de generación del número al azar
	 * @param max Límite superior de generación del número al azar
	 * @return Número generado al azar entre dos límites.
	 */
	public static int obtenerNumeroAzar (int min, int max) {
		 return (int) Math.round(Math.random() * (max - min)) + min;
	}
	 
 
	/**
	 * Pide un número entero al usuario
	 * @param mensaje String que va a mostrarse en consola para pedir el número
	 * @return Número entero introducido por el usuario
	 */
	public static int pideNumeroEntero (String mensaje) {
		int n = 0;
		boolean esNumeroCorrecto;
		Scanner sc = new Scanner(System.in);
		
		do {
			esNumeroCorrecto = false;
			try {
				System.out.println(mensaje);
				n = Integer.parseInt(sc.nextLine());
				esNumeroCorrecto = true;
			}
			catch (Exception e) {
				System.out.println("No ha introducido un número");
			}
		} while (esNumeroCorrecto == false);
		
		return n;
	}
	
	
	
	/**
	 * Obtiene un número entero introducido por el usuario, por el método de InputStreamReader
	 * @return Número entero introducido por el usuario.
	 */
	public static int obtenerEnteroPorInputStreamReader () {
		int numero = 0;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader (isr);
			numero = Integer.parseInt (br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return numero;
	}

	
	/**
	 * Obtiene un número entero a través de un objeto Scanner
	 * @return Número entero introducido por el usuario.
	 */
	public static int obtenerEnteroPorScanner() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				return sc.nextInt();
			} catch (Exception ex) {
				System.out.println("Error, introduce un número entero: ");
				sc.nextLine();
			}
		}
		
	}
	
	/**
	 * Obtiene un número entero a través de un JOptionPane
	 * @return Número entero introducido a través de un JOptionPane.
	 */
	public static int obtenerEnteroPorJOptionPane() {
		String str = JOptionPane.showInputDialog("Introduce un número");
		int numEntero = Integer.parseInt(str);
		return numEntero;
	}
	
	
	/**
	 * 
	 * @param mensaje
	 * @return
	 */
	public static int obtenerEnteroPorJOptionPane (String mensaje) {
		String str = JOptionPane.showInputDialog(mensaje);
		int numEntero = Integer.parseInt(str);
		return numEntero;
	}
	
	
	public static int obtenerEnteroConDescripcion(String desc) {
		System.out.println(desc);
		int num = obtenerEnteroPorScanner();
		return num;
	}
	
	/**
	 * 
	 * @return Número entero introducido por el usuario
	 */
	public static int obtenerEntero() {
		return obtenerEnteroPorJOptionPane();
	}
	
	/**
	 * 
	 * @param mensajeAlUsuario
	 * @param limiteInf
	 * @param limiteSup
	 * @return
	 */
	public static int obtenerEnteroEntreLimites (String mensajeAlUsuario, int limiteInf,
			int limiteSup) {
		int numeroADelvolver = 0;
		
		Scanner sc = new Scanner(System.in);
		boolean datoCorrecto;
		do {
			try {
				datoCorrecto = true;
				System.out.println(mensajeAlUsuario);
				numeroADelvolver = sc.nextInt();

				if (numeroADelvolver < limiteInf || numeroADelvolver > limiteSup) {
					datoCorrecto = false;
					System.out.println("ERROR, debes introducir un número entre " +
							limiteInf + " y " + limiteSup);
				}
			}
			catch (Exception ex) {
				System.out.println("ERROR, no has introducido un dato númerico entre " + 
						limiteInf + " y " + limiteSup);
				sc.next();
				datoCorrecto = false;
			}
		} while (!datoCorrecto);

		return numeroADelvolver;
	}
	
	/**
	 * 
	 * @return
	 */
	public static String obtenerCadena () {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	/**
	 * 
	 * @return
	 */
	public static String obtenerCadenaConDescripcion (String desc) {
		Scanner sc = new Scanner(System.in);
		System.out.println(desc);
		return sc.nextLine();
	}


	public static String obtenerStringPorScanner() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String args[]) {
		int num = Utils.obtenerNumeroAzar(10, 20);
		System.out.println(num);
	}

	

	/**
	 * 
	 * @param min Límite inferior de generación del número al azar
	 * @param max Límite superior de generación del número al azar
	 * @return Número generado al azar entre dos límites.
	 */
	public static int obtenerNumeroAzar1(int min, int max) {
		return (int) Math.round(Math.random() * (max - min)) + min;
	}

	/**
	 * Obtiene un número entero introducido por el usuario, por el método de
	 * InputStreamReader
	 * 
	 * @return Número entero introducido por el usuario.
	 */
	public static int obtenerEnteroPorInputStreamReader1() {
		int numero = 0;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			numero = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return numero;
	}

	/**
	 * Obtiene un número entero a través de un objeto Scanner
	 * 
	 * @return Número entero introducido por el usuario.
	 */
	public static int obtenerEnteroPorScanner1() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	/**
	 * Obtiene un número entero a través de un JOptionPane
	 * 
	 * @return Número entero introducido a través de un JOptionPane.
	 */
	public static int obtenerEnteroPorJOptionPaneConDescripcion(String desc) {
		String str = JOptionPane.showInputDialog(desc);
		int numEntero = Integer.parseInt(str);
		return numEntero;
	}
	
	public static String obtenerStringPorJOptionPaneConDescripcion(String desc) {
		String str = JOptionPane.showInputDialog(desc);
		return str;
	}
	
	
	public static float obtenerFloatPorJOptionPaneConDescripcion(String desc) {
		String str = JOptionPane.showInputDialog(desc);
		float num = Float.parseFloat(str);
		return num;
	}

	public static int obtenerEnteroPorJOptionPaneEntreLimitesYDescripcion(int min, int max, String desc) {
		
		int numEntero;
		do {
			numEntero = Utils.obtenerEnteroPorJOptionPaneConDescripcion(desc);
		} while (numEntero <= min || numEntero >= max);
		
		return numEntero;

	}

	public static int obtenerEnteroConDescripcion1(String desc) {
		System.out.println(desc);
		int num = obtenerEnteroPorScanner();
		return num;
	}

	/**
	 * 
	 * @return Número entero introducido por el usuario
	 */
	public static int obtenerEntero1() {
		return obtenerEnteroPorScanner();
	}
	
	public static Date parseoFecha(String fechaSinParseo) {
		
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

		String fecha = fechaSinParseo;

		Date fechaParseada = null;

		try {
			fechaParseada = formatoFecha.parse(fecha);
		} catch (ParseException e) {
			System.out.println("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		
		return fechaParseada;
		
		
	}

}
