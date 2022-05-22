package proiect.observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Restaurant implements ActionListener {
    HomeScreen homeScreen;
    public static ArrayList<String> toDeliver;
    public static ArrayList<Client> clients;
    public static ArrayList<Waiter> waiters;

    public Restaurant(HomeScreen homeScreen) {
        this.homeScreen = homeScreen;
        clients = new ArrayList<>();
        waiters = new ArrayList<>();
        toDeliver = new ArrayList<>();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(homeScreen.getRestaurantRole().getSelectedItem().equals("Waiter")) {
            WaiterWindow waiterWindow = new WaiterWindow();
        }
        else if(homeScreen.getRestaurantRole().getSelectedItem().equals("Client")) {
            ClientWindow clientWindow = new ClientWindow();
        }
    }
}
