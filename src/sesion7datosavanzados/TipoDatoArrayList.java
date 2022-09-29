package sesion7datosavanzados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class TipoDatoArrayList {

    public static void main(String[] args){

        // CapacidadVector = CapacidadVector * 2
        //CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5)

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");
        System.out.println(lista);

        lista.remove("ElementoB");
        System.out.println(lista);

        for (String nombre : lista){
            System.out.println("nombre" + nombre);
        }

        for (int i = 0; i <lista.size(); i++){
            System.out.println("Nombre en posicion" + i + ": " + lista.get(i));
        }

        //Convertir el ArrayList a un Array
        String[] array = new String[lista.size()];
        for(int i = 0; i < lista.size(); i++){
            array[i] = lista.get(i);
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));

        //DIFERENCIA ENTRE ARRAYLIST Y LINKEDLIST
        //Un ArrayList usa un array subyacente (Es más rapido para almacenar y buscar datos)
        //Un LinkedList usa listas doblemente enlazadas (Es más rapida cuando se quiere modificar datos)
        LinkedList<String> listaEnalazada = new LinkedList<String>();
    }
}
