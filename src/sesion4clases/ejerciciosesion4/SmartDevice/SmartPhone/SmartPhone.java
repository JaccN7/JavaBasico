package sesion4clases.ejerciciosesion4.SmartDevice.SmartPhone;

import sesion4clases.ejerciciosesion4.SmartDevice.SmartDevice;

public class SmartPhone extends SmartDevice {
    protected int cantidadCamaras;
    boolean lectorHuellas;

    public SmartPhone(){}

    public SmartPhone(int cantidadCamaras, boolean lectorHuellas) {
        this.cantidadCamaras = cantidadCamaras;
        this.lectorHuellas = lectorHuellas;
    }

    public SmartPhone(String nombreDispositivo, String procesador, int RAM, double almacenamiento, int precio, int cantidadCamaras, boolean lectorHuellas) {
        super(nombreDispositivo, procesador, RAM, almacenamiento, precio);
        this.cantidadCamaras = cantidadCamaras;
        this.lectorHuellas = lectorHuellas;
    }

    @Override
    public String toString() {
        return "  Caracteristicas SmartPhone:" +
                "\n     Nombre dispositivo" + nombreDispositivo +
                "\n     Procesador: " + procesador +
                "\n     RAM: " + RAM +
                "\n     Almacenamiento Interno: " + almacenamiento +
                "\n     Precio: " + precio +
                "\n     Cantidad de Camaras: " + cantidadCamaras +
                "\n     Lector de huellas: " + lectorHuellas;
    }
}
