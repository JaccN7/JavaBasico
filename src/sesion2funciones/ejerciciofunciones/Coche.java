package sesion2funciones.ejerciciofunciones;

public class Coche {
    int cantidadPuertas;

    Coche(){}

    Coche(int cantidadPuertas){
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setAgregarPuerta(int cantidadPuertas) {
        this.cantidadPuertas += cantidadPuertas;
    }
}
