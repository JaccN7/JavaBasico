package sesion4clases.ejercicioencapsulacion;

public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(){}

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return this.nombre + " tiene " + this.edad + " años, y su numero de telefono es " + this.telefono;
    }
}
