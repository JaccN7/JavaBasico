package sesion3estructurascontrol.ejercicioSesion3;

/*
 * Crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 * Tened en cuenta que los textos pueden venir de un array de tipo String.
 * Por ejemplo:
 * String[] nombres = {"", "", "", ""}
 */
public class ConcatenarTextos {
    public static void main(String[] args){
        String texto = " ";
        String[] arrayNombres = { "Eric", "Kenny", "Stan", "Kyle"};
        for(int i = 0; i < arrayNombres.length; i++){
            texto +=  " " + arrayNombres[i];
        }
        System.out.println(texto);
    }
}
