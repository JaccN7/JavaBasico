package sesion3estructurascontrol.repeticion;

public class For {
    public static void main (String[] args){
        for(int i = 0; i < 5; i++){
            System.out.println(2*i);
            System.out.println("El valor de i es: " + i);
        }

        String[] nombres = { "Eric", "Kenny", "Stan", "Kyle"};
        for (int i = 0; i<nombres.length; i++){
            System.out.println(nombres[i]);
        }

        int suma = 0;
        int[] numeros = {5, 6, 9};
        for (int i = 0; i < numeros.length; i ++){
            suma+=numeros[i];
        }
        System.out.println("El valor de la suma es: " + suma);
    }
}
