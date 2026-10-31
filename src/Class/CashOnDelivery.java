package Class;

import Interface.PaymentMethod;

public class CashOnDelivery implements PaymentMethod {
    public void pay(){
        System.out.println("Cash On Delivery");
    }
}
