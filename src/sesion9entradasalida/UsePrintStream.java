package sesion9entradasalida;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * PrintStream salidas
 */

public class UsePrintStream {
    public static void main(String[] args){
        try {
            PrintStream info = new PrintStream("src/sesion9entradaSalida/printstream.txt");
            info.println("Escribir o sobreescribir un archivo con PrintStream");
            info.close();
            System.out.println("Se realizo la operacion correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        }

        //COPIAR LA INFORMACIÓN DE UN FICHERO A OTRO
        try {
            InputStream in = new FileInputStream("src/sesion9entradasalida/archivoTexto.txt");
            byte[] datos = in.readAllBytes();
            in.close();
            PrintStream out = new PrintStream("src/sesion9entradasalida/archivoTextoCopia.txt");
            out.write(datos);
            out.close();
            System.out.println("Se copio el archivo exitosamente");
        }catch(Exception e){
            System.out.println("" + e.getMessage());
        }
    }
}
