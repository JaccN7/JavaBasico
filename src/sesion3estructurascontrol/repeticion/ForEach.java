package sesion3estructurascontrol.repeticion;

public class ForEach {
    public static void main (String[] args){
        String[] nombres = { "Eric", "Kenny", "Stan", "Kyle"};

        for(String nombre : nombres ){
            System.out.println("Nombre: " + nombre);
        }
    }
}
