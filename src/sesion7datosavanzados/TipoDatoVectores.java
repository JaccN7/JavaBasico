package sesion7datosavanzados;

import java.util.Vector;

public class TipoDatoVectores {

    public static void main(String[] args){

        Vector<Integer> vector = new Vector<>();
        vector.add(9);
        vector.add(15);
        vector.add(26);
        System.out.println("Datos del vector: " + vector);

        vector.remove(2);
        System.out.println("Datos del vector: " + vector);

        // Un vector tiene un array de fondo de capacidad máxima 10 (default)
        // Cuando se llena se crea un array nuevo con 10 espacios mas que el original
        // El array original se copia al array con más espacio
        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());

        vector.add(29);
        vector.add(5);
        vector.add(126);
        vector.add(91);
        vector.add(151);
        vector.add(86);
        vector.add(59);
        vector.add(65);
        vector.add(76);
        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());

        //Indicar capacidad inicial y los incrementos
        Vector<Integer> vector2 = new Vector<>(2,5);
        vector2.add(45);
        vector2.add(55);
        //Se supero la capacidad establecida del vector
        System.out.println("Vector2 tamaño: " + vector2.size() + " y capacidad: " + vector2.capacity());
        vector2.add(65);
        //Se crea incrementa en la capcidad especificada
        System.out.println("Vector2 tamaño: " + vector2.size() + " y capacidad: " + vector2.capacity());

        //Comparar Vectores
        boolean resultado = vector.equals(vector2);
        System.out.println("Son iguales? " + resultado);

        //Recorrer un vector
        System.out.println("Usando foreach");
        for(int i : vector){
            System.out.println("Valor vector: " + i);
        }

        System.out.println("Usando for normal");
        for(int i = 0; i <vector.size(); i++){
            System.out.println("Valor en posición " + i + ": " + vector.get(i));
        }

        for(int i = 0; i <vector.size(); i++){
            if(i % 2 == 0 ){
                vector.remove(i);
                continue;
            }
            System.out.println("Valor en posición " + i + ": " + vector.get(i));
        }

        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());
        //Reducir el tamaño de un Vector hasta la cantidad de valores que posea
        vector.trimToSize();
        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());
    }
}
