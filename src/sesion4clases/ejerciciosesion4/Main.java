package sesion4clases.ejerciciosesion4;

import sesion4clases.ejerciciosesion4.SmartDevice.SmartPhone.SmartPhone;
import sesion4clases.ejerciciosesion4.SmartDevice.SmartWatch.SmartWatch;

/**
 *
 * Crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 * Agregar atributos.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * Desde una clase Main: crear objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 *
 */

public class Main {

    public static void main(String[] args){

        //SmartPhone
        SmartPhone pocoPro = new SmartPhone("Xiaomi POCO X3 Pro", "Qualcomm Snapdragon 860", 8, 256, 219990, 5, true);
        System.out.println("Xiaomi POCO X3 Pro: \n" + pocoPro + "\n\n");

        //SmartWatch
        SmartWatch myWatch = new SmartWatch("Xiaomi Mi Watch", " Qualcomm Snapdragon Wear 3100", 1, 8, 89990, true);
        System.out.println("Xiaomi Mi Watch: \n" + myWatch);
    }
}
