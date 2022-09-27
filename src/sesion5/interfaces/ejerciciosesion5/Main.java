package sesion5.interfaces.ejerciciosesion5;

public class Main {
    public static void main(String[] args){

        CocheCRUDImpl cocheImplementacion = new CocheCRUDImpl();

        cocheImplementacion.save();
        cocheImplementacion.findAll();
        cocheImplementacion.delete(new Coche("Kia", 2018));

    }
}
