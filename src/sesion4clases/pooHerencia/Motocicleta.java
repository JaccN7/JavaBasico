package sesion4clases.pooHerencia;

import sesion4clases.pooClasesyObjetos.MotorVehiculo;
import sesion4clases.pooClasesyObjetos.Vehiculo;

/**
 * Una clase que extiende de otra puede nombrarse como:
 * Clase Derivada, Clase Hija o SubClase
 */
public class Motocicleta extends Vehiculo {

    boolean baul;
    //Ciclomotores, Scooter, Naked, Racing, Trail, Motocross, Cruiser
    String tipoMotocicleta;

    public Motocicleta(){};

    public Motocicleta(boolean baul, String tipoMotocicleta) {
        this.baul = baul;
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public Motocicleta(String fabricante, String modelo, Integer annioFabricacion, Double capacidadEstanque, boolean sport, MotorVehiculo motorVehiculo, boolean baul, String tipoMotocicleta) {
        super(fabricante, modelo, annioFabricacion, capacidadEstanque, sport, motorVehiculo);
        this.baul = baul;
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public Motocicleta(String fabricante, String modelo, boolean baul, String tipoMotocicleta) {
        super(fabricante, modelo);
        this.baul = baul;
        this.tipoMotocicleta = tipoMotocicleta;
    }

    @Override
    public String toString() {
        return "\n  Caracteristicas especiales de la Motocicleta: " +
                "\n     Baul: " + baul +
                "\n     Tipo Motocicleta: " + tipoMotocicleta;
    }
}
