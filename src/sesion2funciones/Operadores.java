package sesion2funciones;

public class Operadores {
    public static void main(String[] args){

        //Operadores
        //Aritmeticos
        int numero1 = 10;
        int numero2 = 20;

        int resultadoSuma = numero1 + numero2;

        System.out.println("Resultado Suma: " + numero1 + " + " + numero2 + " = " + resultadoSuma);
        double resultadoSuma2 = resultadoSuma + 5.77;
        System.out.println(resultadoSuma + " + " + 5.77 + " = " + resultadoSuma2);

        /*Comparación
        < menor que
        > mayor que
        <= menor o igual que
        >= mayor o igual que
        == igual que
        */

        boolean resultado1 = numero1 > numero2; //false
        System.out.println(resultado1);

        boolean resultado2 = numero2 < numero2; //true
        System.out.println(resultado2);


        /*
        Lógicos
        and &&
        or ||
        */

        boolean resultado3 = numero1 > 5 && numero1<30;

        int edad = 17;
        boolean carnetJoven = edad >=15 && edad <=26;
        System.out.println(carnetJoven);


        /*
        Operadores
        incremento ++
        decremento --
        * */
    }
}
