package sesion4clases.pooClasesyObjetos;

/**
 * Clase base, superclase o Clase padre
 */
public class Vehiculo {

    //public accesible desde fuera de la Clase (desde otras clases)
    //Encapsular atributos con private
    //Encapsular atributos sirve para proteger el atributo de cambios o accesos indebidos
    //Private no es accesible desde fuera de la clase (dede otras clases)
    //Para tener acceso a una varaible Private se debe usar Getters y Setters, para dar acceso al atibuto de forma controlada
    //1.- Atributos
    String fabricante;
    String modelo;
    Integer annioFabricacion;
    Double capacidadEstanque;
    boolean sport;
    int velocidad;
    MotorVehiculo motorVehiculo;

    //2.- Constructores
    //Constructor vacio
    public Vehiculo(){};

    //Sobrecarga del método constructor
    //Con This hace referencia al atributo de la clase Vehiculo
    //Y con la declaracion se hace referencia a los argumentos/parametros que recibira el metodo constuctor (Valores que recibira la función)
    public Vehiculo(String fabricante, String modelo, Integer annioFabricacion, Double capacidadEstanque, boolean sport, MotorVehiculo motorVehiculo){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.annioFabricacion = annioFabricacion;
        this.capacidadEstanque = capacidadEstanque;
        this.sport = sport;
        this.velocidad = 0;
        this.motorVehiculo = motorVehiculo;
    }

    //Sobrecarga del metodo constructor
    //Constructor que requiere solo 2 parametros
    public Vehiculo(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    //3.- Métodos (Comportamiento)
    public void acelerarVehiculo(int cantidad){
        this.velocidad += cantidad;
        System.out.println("La velociad es de: " + velocidad + " km/h");
    }

    @Override
    public String toString() {
        return "\n  Fabricante: " + fabricante +
                "\n  Modelo: " + modelo +
                "\n  Año Fabricacion: " + annioFabricacion +
                "\n  Capacidad Estanque: " + capacidadEstanque +
                "\n  Sport: " + sport +
                "\n  Velocidad: " + velocidad +
                "\n  Motor Vehiculo: " + motorVehiculo;
    }
}
