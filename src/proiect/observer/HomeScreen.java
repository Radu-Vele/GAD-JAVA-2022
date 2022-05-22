package proiect.observer;

import javax.swing.*;

public class HomeScreen extends JFrame{
    private JPanel mainPanel;
    private JButton logInButton;
    private JLabel label;
    private JComboBox restaurantRole;
    Restaurant restaurant;

    public HomeScreen() {
        restaurant = new Restaurant(this);
        setContentPane(mainPanel);
        setSize(350, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Restaurant Home Screen");
        logInButton.addActionListener(restaurant);
    }

    public static void main(String[] args) {
        HomeScreen homeScreen = new HomeScreen();
    }

    public JComboBox getRestaurantRole() {
        return restaurantRole;
    }
}
