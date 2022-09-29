package sesion8manejoerrores;

import java.util.HashMap;
import java.util.Map;

public class Warnings {

    //Dejar de marcar warning
    //@SuppressWarnings("rawtypes")
    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();
        map.put("clave1", 10);
        map.put("clave2", 20);
        map.put("clave3", 30);

        for (Map.Entry<String, Integer> elemento : map.entrySet()){
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento valor es: " + elemento.getValue());
        }
    }
}
