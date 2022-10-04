package sesion9entradasalida.ejerciciosesion9;

/**
 * Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código"
 */

public class EjercicioException {
    public static void main(String[] args){
            int resultado = dividePorCero(5,0);
            System.out.println("El resultado es: " + resultado);
    }

    static int dividePorCero(int num1, int num2) throws ArithmeticException{
        int resultado = 0;
        try {
            resultado = num1/num2;
            return resultado;
        }catch(ArithmeticException e) {
            System.out.println("Se ha producido un error. \n" + e.getMessage());
            return resultado;
        }
    }
}
