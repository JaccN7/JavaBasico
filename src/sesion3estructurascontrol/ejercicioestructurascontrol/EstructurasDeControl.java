package sesion3estructurascontrol.ejercicioestructurascontrol;

import java.util.Scanner;

/**
 * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
 *
 * Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
 *      Incrementar el valor de la variable en uno cada vez que se ejecute.
 *      Mostrarlo por pantalla cada vez que se ejecute.
 *
 * Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
 *
 * Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
 *
 * Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */


public class EstructurasDeControl {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int entero = scanner.nextInt();
        if(entero < 0){
            System.out.println("El numero " + entero + " es negativo.");
        }else{
            System.out.println("El numero " + entero + " es positivo");
        }

        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println("numeroWhile en ciclo While: " + numeroWhile);
            numeroWhile++;
        }

        do{
            numeroWhile++;
            System.out.println("numeroWhile en ciclo do while: " + numeroWhile);
        }while(numeroWhile<3);

        int numeroFor = 0;
        for(int i = 0; i < 3; i++){
            numeroFor++;
            System.out.println("numeroFor: " + numeroFor);
        }

        System.out.println("Ingrese una estación. (Verano, Primavera, Invierno, Otoño)");
        String estacion = scanner.next();
        System.out.println("En hemisferio sur: ");
        switch (estacion){
            case "Verano":
                System.out.println("Desde miércoles 21 de diciembre hasta lunes 20 de marzo de 2023");
                break;
            case "Primavera":
                System.out.println("Desde jueves 22 de septiembre hasta miércoles 21 de diciembre");
                break;
            case "Invierno":
                System.out.println("Desde martes 21 de junio hasta jueves 22 de septiembre");
                break;
            case "Otoño":
                System.out.println("Desde lunes 20 de marzo hasta miercoles 21 de junio");
                break;
            default:
                System.out.println("No se ha logrado identificar");
                break;
        }
    }
}
