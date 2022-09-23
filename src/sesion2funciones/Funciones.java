package sesion2funciones;

public class Funciones {
    public static void main(String[] args){

        String nombre = "Nathan";
        String apellido = "Drake";

        //Invocación 1° función
        showMenu();

        //Invocación 2° función // Como devuelve satos debe guardarse en una variable o imprimir directamente la función
        String valorFuncion = getMenu();
        System.out.println("Imprimir variable que contiene el resultado de la función: " + valorFuncion);
        System.out.println("Imprimir funcion directamente: " + getMenu());


        //Invocación 3° función // se le pasa el nombre de una persona para Saludar
        saludo(nombre);

        //Invocación 4° función //
        String resultadoFuncion = obtenerSaludo(nombre,apellido);
        System.out.println("Función obtenerSaludo: " + resultadoFuncion);
    }

    //1° función: No recibe parametros y Sin retorno // No retorna datos
    static void showMenu(){
        System.out.println("Bienvenidos al E-commerce de videojuegos");
        System.out.println("1.- Ver videojuegos");
        System.out.println("2.- Comprar videojuegos");
        System.out.println("3.- Salir");
    }

    //2° función: No recibe parametros y tiene un retorno // Devuelve datos
    static String getMenu(){
        return "Entraste al menú 2.- Comprar videojuegos";
    }

    //3° función: Recibe parametros y no tiene tipos de retorno
    static void saludo(String personaSaludar){
        System.out.println("Hola " + personaSaludar + ", ¿Cómo estás?");
    }

    //4° función: Recibe parametros y tiene un tipo de retorno
    static String obtenerSaludo(String nombre, String apellido){
        System.out.println("Entre a la función 4");
        return "Hola " + nombre + " " + apellido;
    }
}
