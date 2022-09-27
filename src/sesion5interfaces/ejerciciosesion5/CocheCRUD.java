package sesion5interfaces.ejerciciosesion5;

import java.util.List;

public interface CocheCRUD {

    void save();

    List<Coche> findAll();

    void delete(Coche coche);
}
