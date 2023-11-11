package capitulo4.DiseñoDelJuego3EnRaya;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		  int[][] tablero = new int[3][3];
	        int turno = 1;
	        boolean juegoEnCurso = true;

	        while (juegoEnCurso) {
	            mostrarTablero(tablero);
	            realizarJugada(tablero, turno);
	            juegoEnCurso = !haGanado(tablero, turno) && !tableroLleno(tablero);
	            turno = alternarTurno(turno);
	        }

	        mostrarTablero(tablero);
	        int ganador = determinarGanador(tablero);
	        if (ganador == 0) {
	            System.out.println("¡Empate!");
	        } else {
	            System.out.println("¡El jugador " + ganador + " ha ganado!");
	        }
	    }

	    public static void mostrarTablero(int[][] tablero) {
	        System.out.println("Tablero:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(tablero[i][j] == 0 ? " - " : tablero[i][j] == 1 ? " X " : " O ");
	            }
	            System.out.println();
	        }
	    }

	    public static void realizarJugada(int[][] tablero, int turno) {
	        Scanner scanner = new Scanner(System.in);
	        int fila, columna;

	        do {
	            System.out.println("Turno del jugador " + turno + ". Introduce la fila (0-2) y la columna (0-2) separadas por espacio:");
	            fila = scanner.nextInt();
	            columna = scanner.nextInt();
	        } while (!esJugadaValida(tablero, fila, columna));

	        tablero[fila][columna] = turno;
	    }

	    public static boolean esJugadaValida(int[][] tablero, int fila, int columna) {
	        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == 0;
	    }

	    public static int alternarTurno(int turno) {
	        return (turno % 2) + 1;
	    }

	    public static boolean haGanado(int[][] tablero, int jugador) {
	        // Verificar filas y columnas
	        for (int i = 0; i < 3; i++) {
	            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
	                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
	                return true;
	            }
	        }

	        // Verificar diagonales
	        return (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
	               (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador);
	    }

	    public static boolean tableroLleno(int[][] tablero) {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (tablero[i][j] == 0) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    public static int determinarGanador(int[][] tablero) {
	        if (haGanado(tablero, 1)) {
	            return 1;
	        } else if (haGanado(tablero, 2)) {
	            return 2;
	        } else {
	            return 0; // Empate
	        }

	}
}
