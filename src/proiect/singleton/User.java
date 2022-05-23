package proiect.singleton;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private String userID;
    private ArrayList<Account> accounts;

    public User(String userID, ArrayList<Account> accounts) {
        this.userID = userID;
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userID, user.userID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID);
    }

    public String getUserID() {
        return userID;
    }

    public String formatForOutput() {
        String output = "";

        for(Account account : accounts) {
            output += account.toString();
            output += "\n";
        }
        return output;
    }
}
