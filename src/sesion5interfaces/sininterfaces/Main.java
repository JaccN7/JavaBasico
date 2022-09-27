package sesion5interfaces.sininterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args){

        //CREAR UN NUEVO EMPLEADO
        Empleado empleado1 = new Empleado("Esteban", "Tapia", "Pereira", 1080000);
        Empleado empleado2 = new Empleado("Karla", "Cruz", "Sanchez", 800000);
        Empleado empleado3 = new Empleado("Tomás", "Garcia", "Sanchez", 800000);

        System.out.println(empleado1);

        EmpleadoCRUDV1 empleadoCRUD = new EmpleadoCRUDV1();

        //GUARDAR EMPLEADOS
        empleadoCRUD.guardarEmpleado(empleado1);
        empleadoCRUD.guardarEmpleado(empleado2);
        empleadoCRUD.guardarEmpleado(empleado3);

        //MOSTRAR EMPLEADOSñ|
        List<Empleado> empleados = empleadoCRUD.buscarEmpleados();
        System.out.println(empleados);
    }
}
