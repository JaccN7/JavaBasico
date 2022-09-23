package sesion1conceptos;

/**
 * En este proyecto de la sesión 1 de Java de OpenBootcamp se puso en práctica:
 * 1.- Crear un proyecto JAVA desde cero.
 * 2.- Crear un paquete.
 * 3.- Dentro del paquete crear una clase
 * 4.- Dentro de la Clase crear un método main
 * 5.- Imprimir todos los tipos de datos.
 */
public class TiposDeDatos {

    public static void main(String[] args){

        //1.-Númericos
            //1.1.- Enteros
            byte variable1 = 4;
            System.out.println("Byte: " + variable1);
            short variable2 = 10;
            System.out.println("Short: " + variable2);
            int variable3 = 30;
            System.out.println("Int: " + variable3);
            long variable4 = 100;
            System.out.println("Long: " + variable4);
            //1.2.- Decimales
            float variable5 = 5.5f;
            System.out.println("Float: " + variable5);
            double variable6 = 10.5d;
            System.out.println("Double: " + variable6);

        //Booleano
        boolean variable7 = false;
        System.out.println("Boolean falso: " + variable7);
        boolean variable8 = true;
        System.out.println("Boolean verdadero: " + variable8);

        //Texto
        char variable9 = 'a';
        System.out.println("Char: " + variable9);
        String variable10 = "Texto"; //Clase String
        System.out.println("String: " + variable10);
        //Los tipos primitivos no podran ser nulos
        //Ejemplo: long precio = null; -> arrojaría error
    }

}
