package sesion3estructurascontrol.condicionales;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args){
        System.out.println("Bienvenido al Club");
        System.out.println("Debes ser mayor de edad para ingresar");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad");

        int edad = Integer.parseInt(scanner.nextLine());
        if (edad<18){
            System.out.println("Es menor de edad, no puede pasar");
        } else {
            System.out.println("Es Mayor de edad, puede pasar bajo.");
        }
    }
}
