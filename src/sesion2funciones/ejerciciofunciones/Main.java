package sesion2funciones.ejerciciofunciones;

/**
 *
 * Primera parte:
 * Crear una función con tres parámetros que sean números que se suman entre sí.
 * Llamar a la función en el main y darle valores.
 *
 * Segunda parte:
 * Crear una clase coche.
 * Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
 * Una función que incremente el número de puertas que tiene el coche.
 * Crear un objeto miCoche en el main y añadirle una puerta.
 * Mostrar el número de puertas que tiene el objeto.
 *
 */

public class Main {
    public static void main(String[] args){
        int resultado = sumarNums(5,10,1);
        System.out.println("El resultado de la suma es: " + resultado);

        Coche miCoche = new Coche(4);
        miCoche.setAgregarPuerta(1);
        System.out.println("La cantidad de puertas es: " + miCoche.getCantidadPuertas());
    }

    static int sumarNums(int a, int b, int c){
        return a + b + c;
    }
}
