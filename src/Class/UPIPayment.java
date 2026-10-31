package Class;

import Interface.PaymentMethod;

public class UPIPayment implements PaymentMethod {
    public void pay(){
        System.out.println("Payment using UPI");
    }
}
