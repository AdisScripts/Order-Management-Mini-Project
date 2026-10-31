package Class;

import Interface.OrderNotifier;

public class EmailNotifier implements OrderNotifier {
    public void Notification(){
        System.out.println("Notified on Email");
    }
}
