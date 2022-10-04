package sesion9entradasalida.ejerciciosesion9;

/**
 * Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
 */

public class ArrayUnidimensional {
    public static void main(String[] args){

        String[] palabras = new String[5];
        palabras[0] = "Maiz";
        palabras[1] = "Tomate";
        palabras[2] = "Lechuga";
        palabras[3] = "Harina";
        palabras[4] = "Arroz";

        for( String palabra : palabras){
            System.out.println(palabra);
        }
    }
}
