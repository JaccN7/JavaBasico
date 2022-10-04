package sesion9entradasalida.ejerciciosesion9;

import java.util.Vector;

/**
 * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
 * Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
 */

public class EjercicioVector {
    public static void main(String[] args){
        Vector<String> paises = new Vector<>();
        paises.add("Estados Unidos");
        paises.add("Inglaterra");
        paises.add("China");
        paises.add("Canada");
        paises.add("Japon");

        System.out.println("Vector de paises original: " + paises);

        paises.remove(1);
        paises.remove(1);

        System.out.println("Vector de paises modificado: " + paises);
    }
}
