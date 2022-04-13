package Lab4.ch1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneBook {
    private Contact[] contacts = new Contact[10000];
    int count = 0;

    public PhoneBook(String inputFile) {
        Scanner s = null;
        double sum = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(inputFile)));
            String name = "";
            String number = "";
            while (s.hasNext()) {
                name = s.next();
                number = s.next();
                contacts[count++] = new Contact(name, number);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "contacts=" + Arrays.toString(contacts) +
                ", count=" + count +
                '}';
    }

    public Contact getContactByName(String name) {
        for(Contact current : contacts) {
            if(current.getName().equals(name)) {
                return current;
            }
        }
        return null;
    }
}
