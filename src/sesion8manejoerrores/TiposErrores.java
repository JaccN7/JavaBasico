package sesion8manejoerrores;

import java.util.Scanner;

public class TiposErrores {

    public static void main (String[] args){

        //ERROR EN TIEMPO DE EJECUCIÓN
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce valor para x: ");
        int numeroA = scanner.nextInt();
        System.out.println("Introduce valor para y: ");
        int numeroB = scanner.nextInt();

        //Posible error: No se controla la divisón por 0
        int resultado = numeroA / numeroB;
        System.out.println(numeroA + "/" + numeroB + " = " + resultado);

        //ERROR DE COMPILACIÓN
        //PROVOCADOS POR ERRORES DE SINTAXIS QUE NO PERMITEN LA EJECUCIÓN DEL PROGRAMA

        //ERROR LÓGICO O ERROR HUMANO
        //LA LOGICA CON LA QUE SE DESARROLLO EL PROGRAMA NO ES LA CORRECTA
        //NO CUMPLE EL OBJETIVO CON EL QUE SE ESTA DESARROLLANDO EL PROGRAMA
        //NO PROVOCA UN ERROR EN TIEMPO DE EJECUCION NI DE COMPILACION
        //SON DIFICILES DE VER
        int temperatura = 15;
        if(temperatura >= 34){
            System.out.println("Frio");
        }
    }

}
