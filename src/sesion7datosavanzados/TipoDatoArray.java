package sesion7datosavanzados;

import java.util.Arrays;

public class TipoDatoArray {

    public static void main(String[] args){

        //Variable que tiene multiples valores consecutivos del mismo tipo

        //Declarar e indicar la longitud del array
        int[] arrayEnteros = new int[4];
        //Inicializar el arreglo
        arrayEnteros[0] = 1;
        arrayEnteros[1] = 2;
        arrayEnteros[2] = 3;
        arrayEnteros[3] = 4;
        System.out.println("Array 1");
        for (int i : arrayEnteros){
            System.out.println(i);
        }

        System.out.println("\nArray 2");
        //Declara e inicializar el arreglo
        int[] arrayEnteros2 = {6, 9, 7};
        for (int i : arrayEnteros2){
            System.out.println(i);
        }

        //Matriz o array bidimensional
        int[][] arrayBidimensional = new int[2][3];

        //Fila 1
        arrayBidimensional[0][0] = 1;
        arrayBidimensional[0][1] = 5;
        arrayBidimensional[0][2] = 7;

        //Fila 2
        arrayBidimensional[1][0] = 2;
        arrayBidimensional[1][1] = 4;
        arrayBidimensional[1][2] = 6;

        for(int i = 0; i < arrayBidimensional.length; i++){
            System.out.println("Valores de fila: " + i);
            for(int j = 0; j < arrayBidimensional[1].length; j++){
                System.out.println("[" + i + "][" + j + "]: " + arrayBidimensional[i][j]);
            }
        }
    }
}
