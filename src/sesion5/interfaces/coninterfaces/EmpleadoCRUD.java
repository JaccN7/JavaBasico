package sesion5.interfaces.coninterfaces;

import sesion5.interfaces.sininterfaces.Empleado;

import java.util.List;

public interface EmpleadoCRUD {
    //LAS INTERFACES SOLO DECLARAN METODOS, NO LOS IMPLEMENTAN
    //ACTUA COMO UN CONTRATO, DICE LO QUE HAY QUE HACER PERO NO LO EJECUTA

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);

}
