package Class;

import Interface.PaymentMethod;

public class CardPayment implements PaymentMethod {
    @Override
    public void pay(){
        System.out.println("Payment using Card");
    }
}
