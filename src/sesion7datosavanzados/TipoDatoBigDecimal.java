package sesion7datosavanzados;

import java.math.BigDecimal;

public class TipoDatoBigDecimal {
    public static void main(String[] args){
        System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f );
        //Resultado esperado 1.0
        //Resultado obtenido 1.0000001

        //Cuando se requiere trabajar con preción es poco recomendable usar los tipos de datos float o double
        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(4);
        BigDecimal resultado = valorA.add(valorB);

        System.out.println(resultado.toString());
    }
}
