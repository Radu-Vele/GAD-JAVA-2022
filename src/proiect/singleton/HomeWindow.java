package proiect.singleton;

import proiect.observer.HomeScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWindow extends JFrame {

    private JPanel mainPanel;
    private JButton openNewATMButton;

    public HomeWindow() {
        setContentPane(mainPanel);
        setSize(350, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Restaurant Home Screen");

        BankRepository bankRepository = BankRepository.getInstance();
        openNewATMButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ATM atm = new ATM(); //when the button is pressed a new ATM instance is created
            }
        });
}

    public static void main(String[] args) {
        HomeWindow homeWindow = new HomeWindow();
    }

}
