package sesion6refactoring.removeassign.bad;

public class Main {

    double calculateDiscount(Order order, double totalPrice){
        if(order == null || order.getPrice() == null) //Programación defensiva
            return totalPrice;

        if(order.getPrice() > 100)
            totalPrice += order.getPrice() * order.getOffer(); // Sobreescribe totalPrice
        return totalPrice;
    }
}
