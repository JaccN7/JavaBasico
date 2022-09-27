package sesion5.interfaces.sininterfaces;

import sesion5.interfaces.sininterfaces.Empleado;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * En este ejemplo se está emulando un trabajo con bases de datos
 * Para eso utlizaremos ArrayList
 *
 * Create/Crear
 * Retrieve/Read/Leer/Mostrar
 * Update/Actualizar
 * Delete/Borrar
 *
 */

public class EmpleadoCRUDV1 {

    //<generic> esto es un generico que nos permite crear listas de distintos tipos de datos
    //List es una interfaz, es como un array, pero dinamico
    //Una interfaz es como un contrato que define una serie de métodos sobre que es lo que hay que hacer, pero no los ejecuta solo los declara
    //ESTRUCTURA DE DATOS
    //Esta estructura está en memoria RAM por lo que si la aplicación se detiene se pierden los datos
    private List<Empleado> empleados = new ArrayList<>();

    //OPERACIONES CRUD
    //GUARDAR UN EMPLEADO - RECIBE UN OBJETO DE LA CLASE EMPLEADO
    public void guardarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    //VER EMPLEADOS
    public List<Empleado> buscarEmpleados(){
        return empleados;
    }
}
