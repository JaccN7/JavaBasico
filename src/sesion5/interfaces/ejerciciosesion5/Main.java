package sesion5.interfaces.ejerciciosesion5;

/**
 *
 * Instrucciones:
 * Crear una interfaz CocheCRUD.
 * Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
 * Como métodos de CocheCRUD podemos poner:
 * save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
 * Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
 *
 */
public class Main {
    public static void main(String[] args){

        CocheCRUDImpl cocheImplementacion = new CocheCRUDImpl();

        cocheImplementacion.save();
        cocheImplementacion.findAll();
        cocheImplementacion.delete(new Coche("Kia", 2018));

    }
}
