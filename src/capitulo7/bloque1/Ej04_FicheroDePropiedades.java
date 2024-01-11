package capitulo7.bloque1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class Ej04_FicheroDePropiedades {

    	private static Properties propiedades = null;

    	public Ej04_FicheroDePropiedades () {
    		super();
    	}
    	
    	/**
    	 * 
    	 * @return
    	 */
    	private static Properties getPropiedades() {
    		if (propiedades == null) {
    			propiedades = new Properties();
    		    
    			try {
    				// Una forma de leer el fichero de propiedades
//    				propiedades.load(propiedades.getClass().getResourceAsStream("/tutorialJava/capitulo6_Recursos/ejemplo.properties"));

    				// Otra forma de leer el fichero de propiedades
    				File file = new File("./src/capitulo7/config.properties");
    				System.out.println("Fichero encontrado: " + file.exists());
    				propiedades.load(new FileReader(file));
    			
    			} catch (FileNotFoundException e) {
    				e.printStackTrace();
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    			 
    		}
    		return propiedades;
    	}

    	/**
    	 * 
    	 * @param nombrePropiedad
    	 * @return
    	 */
    	public static String getProperty(String nombrePropiedad) {
    		return getPropiedades().getProperty(nombrePropiedad);
    	}

    	
    	/**
    	 * 
    	 * @param nombrePropiedad
    	 * @return
    	 */
    	public static int getIntProperty (String nombrePropiedad) {
    		return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
    	}
    	
    	
    	/**
    	 * 
    	 * @param nombrePropiedad
    	 * @return
    	 */
    	public static Float getFloatProperty (String nombrePropiedad) {
    		return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
    	}
    	
    	
    	/**
    	 * 
    	 * @param args
    	 */
    	public static void main (String args[]) {
    		String texto = Ej04_FicheroDePropiedades.getProperty("Texto");
    		int entero = Ej04_FicheroDePropiedades.getIntProperty("Entero");
    		String flotante = Ej04_FicheroDePropiedades.getProperty("Flotante");
    		String booleano = Ej04_FicheroDePropiedades.getProperty("Booleano");
    		
    		 // Imprimir propiedades
            System.out.println("Texto: " + texto);
            System.out.println("Entero: " + entero);
            System.out.println("Flotante: " + flotante);
            System.out.println("Booleano: " + booleano);
    	
    	}
    }
