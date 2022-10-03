package sesion9entradasalida;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Scanner trabaja con las entradas obtenidas desde consola
 * Por debajo es un InputStream
 */

public class UseScanner {
    public static void main(String[] args){

        //InputStream fichero = new FileInputStream("src/sesion9entradasalida/archivoTexto.txt");
        //Scanner scanner = new Scanner(fichero);

        boolean ok = false;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mete dos numeros: ");
            scanner.reset();
            try{
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                ok = true;
                System.out.println("Los numeros son: " + a + " y " + b);
            }catch (InputMismatchException e){
                System.out.println("Los datos no son correctos.\n" + e.getMessage());
            }
        }while(!ok);
    }
}
