package sesion4clases.pooClasesyObjetos;

import sesion4clases.pooHerencia.Automovil;
import sesion4clases.pooHerencia.Motocicleta;

public class Main {

    //EL MODIFICADOR STATIC INDICA QUE EL METODO PERTENE A LA CLASE Y NO HAY NECESIDAD DE CREAR OBJETOS PARA ACCEDER A LA CLASE
    public static void main(String[] args){

        //CLASES Y OBJETOS
        //Clase identificadorNombre = new Clase();

        //Crear un objeto utliando el contructor vacio
        Vehiculo toyotaPrius = new Vehiculo();

        //Crear un objeto MotorVehiculo para el vehiculo
        MotorVehiculo motorGTI = new MotorVehiculo("GTI", 190, 6);

        //Crear un objeto utilizando el contructor con paramentros
        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2010, 2.1, false, motorGTI);

        //Acceder a los atributos de un objeto
        //Notación punto
        System.out.println("Fabricante del Ford Mondeo " + fordMondeo.fabricante);
        //Acceder al metodo
        fordMondeo.acelerarVehiculo(50);

        //Imprimir todos los atributos del objeto fordMondeo
        System.out.println("Caracteristicas Ford Mondeo: " + fordMondeo);

        //HERENCIA
        //Crear un objeto Motocicleta
        Motocicleta kawasakiNinja = new Motocicleta("Kawasaki Ninja 400 KRT 2020", "EX400GLFA" ,2020, 50.0, true, motorGTI, false, "Racing");

        //Imprimir objeto de la clase motocicleta
        System.out.println("Caraterisicas de la Motocicleta Kawasaki Ninja: " + kawasakiNinja);

        //POLIMORFISMO
        //Hace referencia a multiples formas
        //La variable VehiculoPolimorfismo se puede comportar como una motocicleta o un automovil, las cuales se pueden ver como una forma de Vehiculo
        Vehiculo vehiculoPolimorfismo;

        vehiculoPolimorfismo = new Motocicleta();
        vehiculoPolimorfismo.acelerarVehiculo(50);

        vehiculoPolimorfismo = new Automovil();
        vehiculoPolimorfismo.acelerarVehiculo(45);

        //CLASE ABSTRACTA
        //No se pueden instanciar, solo se puede acceder a ellas desde sus clases hijas
        //Ejemplo: public abstract class Vehiculo
        
    }
}
