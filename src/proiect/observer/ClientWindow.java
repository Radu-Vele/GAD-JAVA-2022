package proiect.observer;

import javax.swing.*;
import java.awt.*;

public class ClientWindow extends JFrame {
    private JPanel panel1;
    private JTextField orderDetails;
    private JButton orderNowButton;
    Client client;

    public ClientWindow() {
            setContentPane(panel1);
            setSize(600, 450);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setVisible(true);
            setTitle("Clients window");
            client = new Client(this);
            orderNowButton.addActionListener(client);
    }

    public JTextField getOrderDetails() {
        return orderDetails;
    }
}
