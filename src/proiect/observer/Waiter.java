package proiect.observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Waiter implements Observer, ActionListener {

    WaiterWindow waiterWindow;

    public Waiter(WaiterWindow waiterWindow) {
        this.waiterWindow = waiterWindow;
        Restaurant.waiters.add(this);
        update();
    }

    @Override
    public void update() {
        JList ordersList = waiterWindow.getOrderList();
        DefaultListModel<String> defaultListModel = new DefaultListModel<String>();

        for(int i = 0; i < Restaurant.toDeliver.size(); i++) {
            defaultListModel.add(i, Restaurant.toDeliver.get(i));
        }

        ordersList.setModel(defaultListModel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(Restaurant.toDeliver.isEmpty()) {
            return;
        }

        int index = waiterWindow.getOrderList().getSelectedIndex();
        Restaurant.toDeliver.remove(index);

        for(Waiter waiter: Restaurant.waiters) {
            waiter.update();
        }
    }
}
