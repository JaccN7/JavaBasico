package sesion6refactoring.extractvariable.good;

import sesion6refactoring.extractvariable.bad.Order;

/**
 *
 * Método de refactorización EXTRACT VARIABLE
 *
 */

public class Main {

    void printProductPrice (Order order){

        // Calcular Precio total

        // 1.- Precio de los productos
        Double quantityPrice = order.getPrice() * order.getQuantity();

        // 2.- Descuento
        Double offerPrice = order.getPrice() * order.getOffer();

        // 3.- Calcular el precio de los productos con el descuento incluido
        Double finalPrice = quantityPrice - offerPrice;

        Double shippingCost = 0.0;

        if(finalPrice < 50){
            shippingCost = 2.99;
        }

        //Precio final
        Double totalPrice = finalPrice + shippingCost;
        System.out.println(totalPrice);
    }

}
