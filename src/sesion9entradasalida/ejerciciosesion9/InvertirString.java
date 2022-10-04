package sesion9entradasalida.ejerciciosesion9;

import java.util.Scanner;

/**
 * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
 */

public class InvertirString {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un mensaje");
        String cadena = scanner.nextLine();
        String texto = reverse(cadena);
        System.out.println(texto);
    }

    public static String reverse(String texto){
        char [] arrayTexto = texto.toCharArray();
        String textoInvertido = "";
        int logitudCadena = texto.length()-1;
        for(int i = logitudCadena; i >= 0; i--){
            textoInvertido += arrayTexto[i];
        }
        return textoInvertido;
    }
}
