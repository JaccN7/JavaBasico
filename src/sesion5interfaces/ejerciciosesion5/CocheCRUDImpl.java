package sesion5interfaces.ejerciciosesion5;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{


    @Override
    public void save() {
        System.out.println("Crear nuevo coche");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Buscar todos los coches");
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Destruir un coche");
    }
}
