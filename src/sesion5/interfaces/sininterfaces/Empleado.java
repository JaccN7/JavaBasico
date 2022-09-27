package sesion5.interfaces.sininterfaces;

public class Empleado {

    //ATRIBUTOS
    String nombre;
    String apellido1;
    String apellido2;
    int salario;

    //CONSTRUCTORES
    public Empleado(){}

    public Empleado(String nombre, String apellido1, String apellido2, int salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.salario = salario;
    }

    //MÉTODOS

    //TOSTRING ES UN REPRESENTACIÓN TEXTUAL DEL OBJETO, SE PUEDE IMPRIMIR POR CONSOLA EN REEMPLAZO DE LA REFERENCIA DE MEMORIA
    @Override
    public java.lang.String toString() {
        return "Empleado:" +
                "Nombre: " + nombre +
                ", Apellido1: " + apellido1 +
                ", Apellido2: " + apellido2 +
                ", Salario: " + salario + "\n";
    }
}
