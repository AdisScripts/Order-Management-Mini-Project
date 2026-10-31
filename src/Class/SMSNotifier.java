package Class;

import Interface.OrderNotifier;

public class SMSNotifier implements OrderNotifier {
    public void Notification(){
        System.out.println("Notified using SMS");
    }
}
