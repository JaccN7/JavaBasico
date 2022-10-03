package sesion9entradasalida;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Leer un archivo de texto
 */

public class UseInputStream {
    public static void main(String[] args){
        //Controlar excepcion en caso de que el fichero no exista
        try {
            InputStream fichero = new FileInputStream("src/sesion9entradasalida/archivoTexto.txt");
            //Controlar excepcion en caso que el fichero no se pueda leer
            try {
                byte[] datos = fichero.readAllBytes();
                for (byte dato : datos) {
                    System.out.println((char) dato);
                }
            }catch(IOException e){
                System.out.println("No se puede leer el fichero. " + e.getMessage());
            }
        }catch(FileNotFoundException e){
            System.out.println("Se ha producido un error al intentar acceder al fichero. " + e.getMessage());
        }
        System.out.println("\n\n");
        try {
            InputStream fichero1 = new FileInputStream("src/sesion9entradasalida/archivoTexto.txt");
            //Controlar excepcion en caso que el fichero no se pueda leer
            try {
                int dato = fichero1.read();
                while(dato != -1){
                    System.out.println((char)dato);
                    dato = fichero1.read();
                }
            }catch(IOException e){
                System.out.println("No se puede leer el fichero. " + e.getMessage());
            }
        }catch(FileNotFoundException e){
            System.out.println("Se ha producido un error al intentar acceder al fichero. " + e.getMessage());
        }

    }
}
