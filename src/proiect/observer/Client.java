package proiect.observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client implements Observable, ActionListener {

    ClientWindow clientWindow;

    public Client(ClientWindow clientWindow) {
        this.clientWindow = clientWindow;
        Restaurant.clients.add(this);
    }

    @Override
    public void notifyObservers() {
        for(Waiter waiter: Restaurant.waiters) {
            waiter.update();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Restaurant.toDeliver.add(clientWindow.getOrderDetails().getText());
        notifyObservers();
    }
}
