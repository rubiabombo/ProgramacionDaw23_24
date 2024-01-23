package examen20240123.primitiva;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;



public class Sorteo {
	private Jugador[] jugadores;
    private int[] numerosSorteo;

    public Sorteo() {
        this.jugadores = new Jugador[10];
        this.numerosSorteo = generarNumerosSorteo();
        inicializarJugadores();
        realizarSorteo();
        calcularResultados();
        ordenarJugadoresPorAciertos();
    }

    private int[] generarNumerosSorteo() {
        Set<Integer> numerosUnicos = new HashSet<>();
        Random random = new Random();

        while (numerosUnicos.size() < 6) {
            numerosUnicos.add(random.nextInt(49) + 1);
        }

        int[] numerosSorteo = new int[6];
        int index = 0;

        for (int numero : numerosUnicos) {
            numerosSorteo[index++] = numero;
        }

        return numerosSorteo;
    }

    private void inicializarJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador("Jugador" + (i + 1));
        }
    }

    private void realizarSorteo() {
        System.out.println("Números del sorteo: " + Arrays.toString(numerosSorteo));
    }

    private void calcularResultados() {
        for (Jugador jugador : jugadores) {
            int aciertos = 0;

            for (int numero : jugador.getBoleto()) {
                if (Arrays.binarySearch(numerosSorteo, numero) >= 0) {
                    aciertos++;
                }
            }

            // Guardar resultados en la variable correspondiente para cada jugador
            System.out.println(jugador.getNombre() + " ha tenido " + aciertos + " aciertos.");
        }
    }

    private void ordenarJugadoresPorAciertos() {
        Arrays.sort(jugadores, (j1, j2) -> {
            // Comparar por la cantidad de aciertos en orden descendente
            int aciertos1 = contarAciertos(j1);
            int aciertos2 = contarAciertos(j2);
            return Integer.compare(aciertos2, aciertos1);
        });
    }

    private int contarAciertos(Jugador jugador) {
        int aciertos = 0;

        for (int numero : jugador.getBoleto()) {
            if (Arrays.binarySearch(numerosSorteo, numero) >= 0) {
                aciertos++;
            }
        }

        return aciertos;
    }

    @Override
    public String toString() {
        return "Sorteo{" +
                "jugadores=" + Arrays.toString(jugadores) +
                ", numerosSorteo=" + Arrays.toString(numerosSorteo) +
                '}';
    }
}




