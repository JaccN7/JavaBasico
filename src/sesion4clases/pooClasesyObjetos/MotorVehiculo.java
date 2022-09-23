package sesion4clases.pooClasesyObjetos;

public class MotorVehiculo {

    //1.- Atributos
    String modeloMotor;
    int caballosFuerza;
    int numCilindros;

    //2.- Contructores
    public MotorVehiculo(){};

    public MotorVehiculo(String modeloMotor, int caballosFuerza, int numCilindros){
        this.modeloMotor = modeloMotor;
        this.caballosFuerza = caballosFuerza;
        this.numCilindros = numCilindros;
    }

    //Métodos
    public void hacerIgnicion(){
        System.out.println("El motor hizo ignición");
    }

    @Override
    public String toString() {
        return "Caracteristicas del Motor: " +
                "\n     Modelo Motor: " + modeloMotor +
                "\n     Caballos de Fuerza: " + caballosFuerza +
                "\n     Cantidad de Cilindros: " + numCilindros;
    }
}
