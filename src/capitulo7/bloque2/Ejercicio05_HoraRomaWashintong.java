package capitulo7.bloque2;

import java.util.Calendar;
import java.util.TimeZone;

public class Ejercicio05_HoraRomaWashintong {

	public static void main(String[] args) {
		
		//Creamos calendar para la hora en Roma
		Calendar roma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		// Mostramos en pantalla
		System.out.println("Hora actual en Roma: " + roma.get(Calendar.HOUR_OF_DAY));

		//Creamos calendar para la hora de Washington, pongo ny porque esta en la misma 
		//zona horaria
		Calendar ny = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		// Mostramos en pantalla
		System.out.println("Hora actual en Washington: " + ny.get(Calendar.HOUR_OF_DAY));
		
		//Para saber la diferencia horaria cogemos lo smilisegundos de las dos zonas horarias y las restamos
		short horasDiferencia = (short) Math.abs(roma.get(Calendar.HOUR_OF_DAY) - ny.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Diferencia horaria: " + horasDiferencia);

	}

}
