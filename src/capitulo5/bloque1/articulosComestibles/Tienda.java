package capitulo5.bloque1.articulosComestibles;

import java.util.ArrayList;
import java.util.List;

import utils.Utils;



public class Tienda {

	public static void main(String[] args) {
		// Objetos Perecederos
		Perecedero yogurt = new Perecedero(3, "Yogurt", (float) 0.60, "01/12/2021");
		Perecedero tomate = new Perecedero(1, "Tomate", (float) 0.22, "14/01/2021");

		// Objetos No Perecederos
		NoPerecedero sal = new NoPerecedero(2, "Sal", (float) 0.02);
		NoPerecedero pimienta = new NoPerecedero(4, "Pimienta", (float) 0.41);

		System.out.println(yogurt + "\n" + tomate + "\n" + sal + "\n" + pimienta);

	}

}