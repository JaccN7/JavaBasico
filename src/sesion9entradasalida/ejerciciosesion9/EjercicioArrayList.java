package sesion9entradasalida.ejerciciosesion9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *  Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
 *
 * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 */

public class EjercicioArrayList {
    public static void main (String[] args){
        // .......
        ArrayList<String> paisesArray = new ArrayList<String>();
        paisesArray.add("Canada");
        paisesArray.add("Inglaterra");
        paisesArray.add("Japon");
        paisesArray.add("China");

        LinkedList<String> paisesLinked = new LinkedList<>();
        paisesLinked.addAll(paisesArray);

        System.out.println("ArrayList:");
        for(String pais : paisesArray){
            System.out.println("ArrayList paises: " + pais);
        }

        System.out.println("\nLinkedList: ");
        for(String pais : paisesLinked){
            System.out.println("LinkedList paises: " + pais);
        }

        // .......

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i= 0; i < 10; i++){
            numeros.add(i+1);
        }
        System.out.println("ArrayList: " + numeros);

        for(int i = 0; i < numeros.size(); i++){
            if(numeros.get(i)%2==0){
                numeros.remove(i);
            }
        }
        System.out.println("ArrayList sin pares: " + numeros);
    }
}
