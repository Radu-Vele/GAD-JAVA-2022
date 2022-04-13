package Lab4.ch1;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("src/Lab4/ch1/input.txt");
        System.out.println(phoneBook.getContactByName("Abbey").getPhoneNumber());
        System.out.println(phoneBook.getContactByName(("Abdul")).getPhoneNumber());
    }
}
