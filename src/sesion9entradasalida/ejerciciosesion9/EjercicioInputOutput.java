package sesion9entradasalida.ejerciciosesion9;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
 */

public class EjercicioInputOutput {
    public static void main (String[] args){
        try {
            String fileIn = "src/sesion9entradasalida/ejerciciosesion9/fileIn.txt";
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            String fileOut = "src/sesion9entradasalida/ejerciciosesion9/fileOut.txt";
            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
