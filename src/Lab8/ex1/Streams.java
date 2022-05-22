package Lab8.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class Streams {
    public static void ex1(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 7, 3 ,9, 5, 12));
        List<Integer> numbers = IntStream.range(0, 11)
                .boxed()
                .map(current -> current.getClass().getName())
                .map(current -> {
                    System.out.println(current); //useful for debug to use {...\n...\n }
                    return current.length();
                })
                .collect(toList());
        System.out.println(numbers);
    }

    public static void ex2(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 7, 3 ,9, 5, 12));
        Integer max = list.stream()
                .reduce((x, y) -> x > y ? x : y)
                .get();
        System.out.println(max);
    }

    public static void ex3(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 7, 3 ,9, 5, 12));
        Integer sum = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(sum);
    }

    public static void ex4(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Alex", "mARIN", "JONI"));
        Map<String, Integer> wordsLength = words.stream()
                .collect(toMap(identity(), e -> e.length()));
        System.out.println(wordsLength);
    }

    public static void ex5(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 8, -18));
        Optional i = list.stream().max(Integer::compareTo); // an optional object is returned

        if(!i.isEmpty()) {
            System.out.println(i.get());
        }
    }

    public static void ex6(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Lab8/ex1/input.txt"));
            String line = reader.readLine();
            String result = "";
            int maxVal = -1;
            while(line != null) {
                if(line.length() > maxVal) {
                    result = line;
                    maxVal = line.length();
                }
                line = reader.readLine();
            }

            System.out.println(result);

        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void ex7(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Lab8/ex1/input.txt"));
            String list = Files.lines(Paths.get("src/Lab8/ex1/input.txt"))
                    .toList()
                    .stream()
                    .max((x, y) -> x.length() - y.length())
                    .get();
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Integer number = IntStream
                .range(0, 11)
                .filter(e -> {
                    System.out.println(e);
                    return e % 2 == 0;
                })
                .map(e -> {
                    System.out.println("------>" + e);
                    return e * 10;
                })
                .max()
                .getAsInt();
        /**
         * Observations:
         * - sequential execution
         * - if we add a .findFirst() the stream processing stops -> lazy evaluation
         */
    }
}
