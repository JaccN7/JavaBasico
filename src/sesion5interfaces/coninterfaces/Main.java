package sesion5interfaces.coninterfaces;

import sesion5interfaces.sininterfaces.Empleado;

public class Main {

    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySQL();
    //static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDExcel();

    public static void main(String[] args){

        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());
    }
}
