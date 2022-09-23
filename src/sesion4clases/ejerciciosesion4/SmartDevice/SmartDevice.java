package sesion4clases.ejerciciosesion4.SmartDevice;

public abstract class SmartDevice {

    protected String nombreDispositivo;
    protected String procesador;
    protected double RAM;
    protected double almacenamiento;
    protected int precio;

    public SmartDevice (){}

    public SmartDevice(String nombreDispositivo, String procesador, double RAM, double almacenamiento, int precio) {
        this.nombreDispositivo = nombreDispositivo;
        this.procesador = procesador;
        this.RAM = RAM;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
    }
}
