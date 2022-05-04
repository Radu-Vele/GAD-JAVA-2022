package Lab8.ch2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.function.Predicate;


public class Producer1 {
    @Test
    public void predicate1() {
        Predicate<String> p1 = s -> s.isEmpty();
        Predicate<String> notPredicate = p1.negate();
        Assert.assertFalse(notPredicate.test(""));
        Assert.assertTrue(notPredicate.test("Not Empty!"));
    }
}
