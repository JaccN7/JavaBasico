package sesion8manejoerrores;

import java.util.Scanner;

public class GestionarErrores {
    public static void main (String[] args){
        //ERROR EN TIEMPO DE EJECUCIÓN
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce valor para x: ");
        int numeroA = scanner.nextInt();
        System.out.println("Introduce valor para y: ");
        int numeroB = scanner.nextInt();

        try {
            //Posible error: No se controla la divisón por 0
            int resultado = numeroA / numeroB;
            System.out.println(numeroA + "/" + numeroB + " = " + resultado);
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }catch(Exception e){ //Cuando no se sabe que excepcion capturar se pueden capturar todas con Exception e
            //Asi podemos identificar la excepcion que esta ocurriendo
            System.out.println("La excepción es: " + e.getClass());
        }finally{
            // Ejecuta todo lo que se encuentre en el bloque finally tanto si tuvo exito como si lanzo una excepcion
            // Se puede usar para reestablecer el valor de las variables o para cerrar procesos pendientes
            System.out.println("finally");
        }
    }
}
