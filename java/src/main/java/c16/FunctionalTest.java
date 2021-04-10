package c16;

import org.junit.Test;

import java.util.function.Predicate;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/4/10 21:29
 */
public class FunctionalTest {
    @Test
    public void hello() {
        boolean b = ddd(str -> str == "abc");
        System.out.println(b);
    }

    public boolean ddd(Predicate<String> abc) {
        return abc.and(str -> {
            System.out.println(str);
            return true;
        }).or(str -> {
            return str == "ccc";
        }).test("abc");
    }
}
