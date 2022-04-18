package Lab5.ex2;

import java.util.List;

public class Main {

    public static double sum(List<? extends Number> list) {
//        list.add(3);
        return list.get(0).doubleValue();
    }

    public static void main(String[] args) {

    }
}
