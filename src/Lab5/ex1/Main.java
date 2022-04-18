package Lab5.ex1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List strings = new ArrayList<>();
        strings.add("New Entry");
        strings.add(new Date());

        for(Object o : strings) {
            try {
                String s = (String) o;
            } catch (ClassCastException e) {
                System.out.println("Not nice");
            }
        }

        List<String> strings2 = new ArrayList<String>();
        strings2.add("cvCv");
        for (String s : strings2) {
            System.out.println(s.toLowerCase());
        }
    }
}
