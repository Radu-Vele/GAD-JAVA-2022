package proiect.observer;

import javax.swing.*;

public class WaiterWindow extends JFrame {
    private JPanel mainPanel;
    private JList orderList;
    private JButton markSelectedOrderAsButton;
    Waiter waiter;

    public WaiterWindow(){
        waiter = new Waiter(this);
        setContentPane(mainPanel);
        setSize(350, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setTitle("Waiters window");
        markSelectedOrderAsButton.addActionListener(waiter);
    }

    public JList getOrderList() {
        return orderList;
    }
}
