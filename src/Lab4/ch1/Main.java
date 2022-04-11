package Lab4.exceptions.ch1;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("src/Lab4/exceptions/ch1/input.txt");
        System.out.println(phoneBook.getContactByName("Abbey"));
    }
}
