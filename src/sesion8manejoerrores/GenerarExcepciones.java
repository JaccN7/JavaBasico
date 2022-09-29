package sesion8manejoerrores;

public class GenerarExcepciones {
    public static void main(String[] args){
        try {
            divide(4, 0);
        }catch(ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");

        }
    }

    //Se declara una funcion que puede arrojar una excepcion
    public static int divide(int A, int B) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = A/B;
            return resultado;
        }catch(ArithmeticException e){
            //Se genera una excepcion de un tipo especifico (Podria generarse de otros tipos)
            throw new ArithmeticException();
        }

    }
}
