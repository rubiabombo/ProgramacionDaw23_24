package capitulo4.bloque6;

import java.util.Random;
import java.util.Scanner;

public class MatrizOperaciones {
    private int[][] matriz;
    private int filas;
    private int columnas;

    public MatrizOperaciones(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new int[filas][columnas];
    }
    //metodo para llenar una matriz
    public void llenarMatrizAleatoria() {
        Random random = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(101); // Valores aleatorios entre 0 y 100
            }
        }
    }
    
    //Metodo para imprimir la matriz

    public void imprimirMatriz() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //Metodo para decir si la matriz es positiva

    public boolean esMatrizPositiva() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }
    //Metodo para decir si la matriz es diagonal
    public boolean esMatrizDiagonal() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    //Metodo para decir si la matriz es triangular superior
    public boolean esMatrizTriangularSuperior() {
        for (int i = 1; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    //Metodo para decir si la matriz es dispersa
    public boolean esMatrizDispersa() {
        for (int i = 0; i < filas; i++) {
            boolean filaNoNula = false;
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == 0) {
                    filaNoNula = true;
                    break;
                }
            }
            if (!filaNoNula) {
                return false;
            }
        }
        for (int j = 0; j < columnas; j++) {
            boolean columnaNoNula = false;
            for (int i = 0; i < filas; i++) {
                if (matriz[i][j] == 0) {
                    columnaNoNula = true;
                    break;
                }
            }
            if (!columnaNoNula) {
                return false;
            }
        }
        return true;
    }
    
    //Metodo para decir si la matriz es a unidimensional
    public int[] matrizAUnidimensional() {
        int[] unidimensional = new int[filas * columnas];
        int k = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                unidimensional[k++] = matriz[i][j];
            }
        }
        return unidimensional;
    }
    
    //Metodo para decir si la matriz es simetrica
    public boolean esMatrizSimetrica() {
        if (filas != columnas) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    //Metodo para mostrar la matriz traspuesta
    public MatrizOperaciones matrizTraspuesta() {
        MatrizOperaciones traspuesta = new MatrizOperaciones(columnas, filas);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta.matriz[j][i] = matriz[i][j];
            }
        }
        return traspuesta;
    }
    
  //Metodo para mostrar la matriz opuesta
    public MatrizOperaciones matrizOpuesta() {
        MatrizOperaciones opuesta = new MatrizOperaciones(filas, columnas);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                opuesta.matriz[i][j] = -matriz[i][j];
            }
        }
        return opuesta;
    }

    
  //Metodo para eliminar una fila
    public MatrizOperaciones eliminarFila(int numeroFila) {
        if (numeroFila < 0 || numeroFila >= filas) {
            System.out.println("Número de fila no válido.");
            return null;
        }

        MatrizOperaciones nuevaMatriz = new MatrizOperaciones(filas - 1, columnas);
        int nuevaFila = 0;
        for (int i = 0; i < filas; i++) {
            if (i == numeroFila) {
                continue; // Saltar la fila especificada
            }
            for (int j = 0; j < columnas; j++) {
                nuevaMatriz.matriz[nuevaFila][j] = matriz[i][j];
            }
            nuevaFila++;
        }
        return nuevaMatriz;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de filas y columnas para la matriz:");
        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();

        MatrizOperaciones matriz = new MatrizOperaciones(filas, columnas);

        matriz.llenarMatrizAleatoria();

        System.out.println("Matriz generada:");
        matriz.imprimirMatriz();

        if (matriz.esMatrizPositiva()) {
            System.out.println("La matriz es positiva.");
        } else {
            System.out.println("La matriz no es positiva.");
        }

        if (matriz.esMatrizDiagonal()) {
            System.out.println("La matriz es diagonal.");
        } else {
            System.out.println("La matriz no es diagonal.");
        }

        if (matriz.esMatrizTriangularSuperior()) {
            System.out.println("La matriz es triangular superior.");
        } else {
            System.out.println("La matriz no es triangular superior.");
        }

        if (matriz.esMatrizDispersa()) {
            System.out.println("La matriz es dispersa.");
        } else {
            System.out.println("La matriz no es dispersa.");
        }

        int[] unidimensional = matriz.matrizAUnidimensional();
        System.out.print("Matriz unidimensional: ");
        for (int valor : unidimensional) {
            System.out.print(valor + " ");
        }
       
		

	}

}
