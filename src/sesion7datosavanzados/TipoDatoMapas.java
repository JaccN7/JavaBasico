package sesion7datosavanzados;

import java.util.HashMap;
import java.util.Map;

public class TipoDatoMapas {
    public static void main (String[] args){
        //MAPA O ARRAY ASOCIATIVO
        //ES UNA ESPECIE DE DICCIONARIO DONDE SE TIENE UNA CLAVE Y UN VALOR

        //Claves tipo cadena de texto y los Valores de tipo entero
        HashMap<String, Integer> map = new HashMap<>();
        map.put("clave1", 10);
        map.put("clave2", 20);
        map.put("clave3", 30);

        System.out.println(map);
        //Imprimir una clave especificada
        System.out.println(map.get("clave2"));

        //Cambiar el valor de una clave
        System.out.println("Valor original clave1: " + map.get("clave1"));
        map.put("clave1", 11); //Si existe la reemplaza y si no existe la crea
        System.out.println("Valor clave1 alterado con put: " + map.get("clave1"));
        map.replace("clave1", 12); // Si existe la reemplaza y si no existe no hace nada
        System.out.println("Valor clave1 alterado con replace: " + map.get("clave1"));

        map.replace("clave5", 15); //Se intenta reemplazar una clave que no existe, resultado obtenido: null
        System.out.println(map.get("clave5"));

        //Eliminar Clave-valor del Mapa
        map.remove("clave3");
        System.out.println(map);

        //Recorrer un mapa
        for (Map.Entry elemento : map.entrySet()){
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento valor es: " + elemento.getValue());
        }
    }
}
