package sesion7datosavanzados;

public class TipoDatoString {

    public static void main (String[] args){
        String cadena = "Cadena de texto";

        //Metodos de la Clase String

        //Obtener extensión de una cadena
        int cadenaLongitud = cadena.length();
        System.out.println("La longitud de la cadena de texto es: " + cadenaLongitud);

        //Pasar la cadena a Mayúsculas
        String cadenaMayuscula = cadena.toUpperCase();
        System.out.println("La cadena en mayusculas es: " + cadenaMayuscula);

        //Pasar la cadena a Minusculas
        String cadenaMinuscula = cadena.toLowerCase();
        System.out.println("La cadena en minusculas es: " + cadenaMinuscula);

        // ....

        //Determinar si la cadena empieza con una palabra establecida
        boolean resultado = cadena.startsWith("Cade") && cadena.endsWith("Texto"); //false
        //boolean resultado = cadena.startsWith("Cade") && cadena.endsWith("texto"); //true
        if(resultado){
            System.out.println("Cumple con la condición");
        }else{
            System.out.println("No cumple con la condición");
        }

        //Caracter en un posicion
        char letra  = cadena.charAt(0);
        System.out.println("Caracter en posición 0: " + letra);
        for(int i = 0; i <  cadena.length(); i++){
            System.out.println("Caracter en la posición " + i + ": " + cadena.charAt(i) );
        }
    }
}
