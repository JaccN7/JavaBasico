package sesion2funciones.ejerciciosesion2;
/*
 * Crear una función que reciba un precio
 * y devuelva el precio con el IVA incluido.
 * Se considera IVA del 19%
 */
public class ObtenerIva {
    public static void main(String[] args){
        int precio = 7500;
        double valorConIva = obtenerIva(precio);
        System.out.println("El precio sin impuestos es: " + precio + " y con un 19% de IVA el valor toal es: " + valorConIva);
    }

    static double obtenerIva(int precio){
        return precio * 1.19;
    }
}
