package proiect.singleton;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Singleton class
 * Contains all accounts data available in the bank
 */
public class BankRepository {
    HashSet<User> userHashSet; //good DS for searching and keeping unique user IDs
    private static BankRepository bankRepositoryInstance;

    private BankRepository() {
        this.userHashSet = BankRepository.importInitialData();
    }

    public static BankRepository getInstance() {
        if(bankRepositoryInstance == null) {
            bankRepositoryInstance = new BankRepository();
        }

        return bankRepositoryInstance;
    }

    /**
     * Populate the bank repository with some data
     */
    public static HashSet<User> importInitialData() {
        Account account1 = new Account(Currency.RON, 100);
        Account account2 = new Account(Currency.EUR, 120);
        Account account3 = new Account(Currency.USD, 130);
        Account account4 = new Account(Currency.RON, 1001);
        Account account5 = new Account(Currency.EUR, 10090);

        ArrayList<Account> accounts1 = new ArrayList<>();
        accounts1.add(account1);
        accounts1.add(account2);
        accounts1.add(account3);

        ArrayList<Account> accounts2 = new ArrayList<>();
        accounts2.add(account4);
        accounts2.add(account5);

        User user1 = new User("User1", accounts1);
        User user2 = new User("User1", accounts2);

        HashSet<User> userHashSet = new HashSet<>();
        userHashSet.add(user1);
        userHashSet.add(user2);

        return userHashSet;
    }

    public User searchByUserID(String ID) {
        User toReturn = null;

        for(User curr : userHashSet) {
            if(curr.getUserID() == ID) {
                return curr;
            }
        }

        return toReturn;
    }
}
