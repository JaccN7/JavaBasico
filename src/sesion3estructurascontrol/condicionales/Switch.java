package sesion3estructurascontrol.condicionales;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        //Comprobar día de la semana

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el día de la semana");
        String diaSemana = scanner.nextLine();

        switch (diaSemana){
            case "Lunes":
                System.out.println("Primer día de la semana");
                break;
            case "Martes":
                System.out.println("Segundo día de la semana");
                break;
            case "Miercoles":
                System.out.println("Tercer día de la semana");
                break;
            case "Jueves":
                System.out.println("Cuarto día de la semana");
                break;
            case "Viernes":
                System.out.println("Quinto día de la semana");
                break;
            case "Sabado":
                System.out.println("Sexto día de la semana");
                break;
            case "Domingo":
                System.out.println("Septimo día de la semana");
                break;
            default:
                System.out.println("No es un día de la semana valido");
                break;
        }
    }
}
