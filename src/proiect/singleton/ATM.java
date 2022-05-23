package proiect.singleton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM extends JFrame {

    private JPanel mainPanel;
    private JPanel welcomePanel;
    private JPanel userPanel;
    private JTextField userID;
    private JTextArea textArea1;
    private JButton proceedButton;

    BankRepository bankRepository;

    public ATM() {
        setContentPane(mainPanel);
        setSize(450, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setTitle("Virtual ATM");
        userPanel.setVisible(false);
        proceedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showUserAccounts();
            }
        });
    }

    public void showUserAccounts() {
        bankRepository = BankRepository.getInstance();
        String currentUserID = userID.getText();

        User currentUser = bankRepository.searchByUserID(currentUserID);

        if(currentUser == null) {
            System.out.println("\nThere is no user with that ID!\n");
            return;
        }

        String outputString = currentUser.formatForOutput();

        textArea1.setText(outputString);

        welcomePanel.setVisible(false);
        userPanel.setVisible(true);
    }
}
