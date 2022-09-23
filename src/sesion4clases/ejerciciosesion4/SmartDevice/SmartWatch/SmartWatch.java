package sesion4clases.ejerciciosesion4.SmartDevice.SmartWatch;

import sesion4clases.ejerciciosesion4.SmartDevice.SmartDevice;

public class SmartWatch extends SmartDevice {
    protected boolean sensorCardiaco;

    public SmartWatch(){}

    public SmartWatch(String nombreDispositivo, String procesador, int RAM, double almacenamiento, int precio, boolean sensorCardiaco) {
        super(nombreDispositivo, procesador, RAM, almacenamiento, precio);
        this.sensorCardiaco = sensorCardiaco;
    }

    @Override
    public String toString() {
        return "  Caracteristicas SmartWatch:" +
                "\n     Nombre dispositivo" + nombreDispositivo +
                "\n     Procesador: " + procesador +
                "\n     RAM: " + RAM +
                "\n     Almacenamiento Interno: " + almacenamiento +
                "\n     Precio: " + precio +
                "\n     Sensor Cardiaco: " + sensorCardiaco;
    }
}
