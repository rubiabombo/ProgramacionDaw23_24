package examen20240123.primitiva;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Jugador {
	private String nombre;
    private int[] boleto;
    private int numeroLoteria;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.boleto = generarBoleto();
        this.numeroLoteria = generarNumeroLoteria();
    }

    private int[] generarBoleto() {
        Set<Integer> numerosUnicos = new HashSet<>();
        Random random = new Random();

        while (numerosUnicos.size() < 6) {
            numerosUnicos.add(random.nextInt(49) + 1);
        }

        int[] boleto = new int[6];
        int index = 0;

        for (int numero : numerosUnicos) {
            boleto[index++] = numero;
        }

        return boleto;
    }

    private int generarNumeroLoteria() {
        return new Random().nextInt(49) + 1;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getBoleto() {
        return boleto;
    }

    public int getNumeroLoteria() {
        return numeroLoteria;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", boleto=" + Arrays.toString(boleto) +
                ", numeroLoteria=" + numeroLoteria +
                '}';
    }
	}



