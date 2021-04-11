package c16;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * <p>
 * 函数式（Functional）接口
 * </p>
 *
 * @author joe 2021/4/10 21:29
 */
public class FunctionalTest {

    @Test
    public void runnableTest() {
        Runnable r1 = () -> System.out.println("hello lambda!");
        r1.run();
    }

    @Test
    public void comparatorTest() {
        // 类型推断
//        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        // 方法引用
        Comparator<Integer> com = Integer::compare;
        int compare = com.reversed().compare(1, 2);
        System.out.println(compare);
    }

    static class Pocket {
        public Double money = 100.00;
    }

    @Test
    public void consumerTest() {
        Pocket pocket = new Pocket();

        // 消费型接口
        Consumer<Pocket> shop1 = p -> p.money--;
        Consumer<Pocket> shop2 = p -> p.money -= 2;

        shop1.andThen(shop2).andThen(shop1).accept(pocket);
        System.out.println(pocket.money);
    }

    @Test
    public void predicateTest() {
        Predicate<String> pre1 = str -> str == "abc";
        Predicate<String> pre2 = str -> str == "cba";
        boolean b = pre1.or(pre2).test("abc");
        System.out.println(b);
    }
}
