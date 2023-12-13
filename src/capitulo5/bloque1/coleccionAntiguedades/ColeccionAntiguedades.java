package capitulo5.bloque1.coleccionAntiguedades;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		Joya anillo = new Joya(1865, "Francia", (float) 25.5, "Oro Blanco");
		Libro quijote = new Libro(1605, "España", (float) 1.5, "Miguel Cervantes", "El quijote");
		Instrumento stradivarius = new Instrumento(1689, "Italia", (float) 33.5, "Violín Stradivarius", "Cuerda");
		Cuadro guernica = new Cuadro(1937, "España", (float) 21.5, "Guernica", "Pablo Picasso");
		
		// Muestro en pantalla los objetos
		System.out.println(anillo + "\n" + quijote + "\n" + stradivarius + "\n" + guernica);

	}

}
