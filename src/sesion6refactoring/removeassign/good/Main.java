package sesion6refactoring.removeassign.good;

import sesion6refactoring.removeassign.bad.Order;

/**
 *
 * Método de refactorización REMOVE ASSIGN
 *
 */

public class Main {

    double calculateDiscount(Order order, double totalPrice){
        //MANTENER INTACTOS LOS PARAMETROS DE ENTRADA
        double result = totalPrice;
        if(order == null || order.getPrice() == null) //Programación defensiva: Comprobar que los parametros que nos estan pasando este correcto
            return result;

        if(order.getPrice() > 100)
            result += order.getPrice() * order.getOffer(); // Sobreescribe totalPrice
        return result;
    }
}
