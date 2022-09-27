package sesion5.interfaces.ejerciciosesion5;

public class Coche {

    private int id;
    private String marca;
    private int anioFabricacion;
    private static int contCoches;

    private Coche(){
        this.id = ++contCoches;
    };

    Coche(String marca, int anioFabricacion){
        this();
        System.out.println(this);
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Coche marca " + this.marca + " del año " + this.anioFabricacion;
    }
}
