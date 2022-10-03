package sesion9entradasalida;

import java.io.*;

/**
 * BufferedInputStream no trabaja con ficheros,si no que con entradas
 * En este caso se pasa el fichero que obtemos con InputStream como entrada(parametro) al BufferedInputStream
 * Luego BufferedInputStream carga una cantidad de datos y los va trabajando por tramos más pequeños
 */

public class UseBufferInputStream {
    public static void main(String[] args){
        try {
            InputStream fichero = new FileInputStream("src/sesion9entradasalida/archivoTexto.txt");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
            //Controlar excepcion en caso que el fichero no se pueda leer
            try {
                int dato = ficheroBuffer.read();
                while(dato != -1){
                    System.out.println((char)dato);
                    dato = ficheroBuffer.read();
                }
            }catch(IOException e){
                System.out.println("No se puede leer el fichero. " + e.getMessage());
            }
        }catch(FileNotFoundException e){
            System.out.println("Se ha producido un error al intentar acceder al fichero. " + e.getMessage());
        }
    }
}
