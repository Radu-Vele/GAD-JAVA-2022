package Lab8.ch1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    @Test
    public void consumer_1(){
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        Consumer<List<String>> consumer = (List<String> list1) -> list1.clear();
        consumer.accept(list);

        Assert.assertEquals(list, new ArrayList<>());
    }


    @Test
    public void consumer_2(){
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> list2 = new ArrayList<>(Arrays.asList("a", "b", "c", "first", "second"));

        Consumer<List<String>> consumer1 = (List<String> l) -> l.add("first");
        Consumer<List<String>> consumer2 = (List<String> l) -> l.add("second");
        Consumer<List<String>> consumer3 = consumer1.andThen(consumer2);
        consumer3.accept(list1);

        Assert.assertEquals(list1, list2);
    }

}
