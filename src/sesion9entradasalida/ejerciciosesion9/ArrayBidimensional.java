package sesion9entradasalida.ejerciciosesion9;

/**
 * Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
 */

public class ArrayBidimensional {
    public static void main(String[] args){
        int[][] numeros = new int[2][3];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;

        numeros[1][0] = 4;
        numeros[1][1] = 5;
        numeros[1][2] = 6;

        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[1].length; j++){
                System.out.println("numeros[" + i + "][" + j + "]: " + numeros[i][j]);
            }
        }
    }
}
