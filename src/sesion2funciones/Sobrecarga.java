package sesion2funciones;

public class Sobrecarga {
    public static void main(String[] args){
        int numero1 = 100;
        int numero2 = 50;
        int numero3 = 320;

        int sumar2Numeros = suma(numero1, numero2);
        int sumar3Numeros = suma(numero1, numero2, numero3);

        System.out.println("Resultado 1: " + sumar2Numeros);
        System.out.println("Resultado 2: " + sumar3Numeros);
    }

    //Sobrecarga de funciones
    //Usar el mismo nombre de función con distinto requermiento de parametros

    static int suma(int numero1, int numero2){
        System.out.println("Se esta sumando " + numero1 + " + " + numero2);
        return numero1 + numero2;
    }

    static int suma(int numero1, int numero2, int numero3){
        System.out.println("Se esta sumando " + numero1 + " + " + numero2 + " + " + numero3);
        return numero1 + numero2 + numero3;
    }
}
