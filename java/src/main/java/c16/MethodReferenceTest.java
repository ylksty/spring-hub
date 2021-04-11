package c16;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * <p>
 * 方法引用与构造器引用
 * </p>
 *
 * @author joe 2021/4/11 17:16
 */
public class MethodReferenceTest {
    // 方法引用
    @Test
    public void test1() {
        // 例一
        Consumer<String> com1 = System.out::println;
        com1.accept("Consume");

        // 例二
        BiPredicate<String, String> bp1 = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };
        // 第一个参数时引用方法的调用者，第二个参数时引用方法的参数
        // 类::非静态
        BiPredicate<String, String> bp2 = String::equals;
        System.out.println(bp1.test("abc", "abc"));
        System.out.println(bp2.test("abc", "abc"));

        // 例三
        Comparator<String> c1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        // 类::非静态
        Comparator<String> c2 = String::compareTo;
        System.out.println(c1.compare("abc", "abc"));
        System.out.println(c2.compare("abc", "abc"));
    }

    public static class Person {
        public Person(Integer age) {
            System.out.println("age = " + age);
        }
    }

    // 构造器引用
    @Test
    public void ConstractorTest() {
        Function<Integer, Person> fun1 = age -> new Person(age);
        Function<Integer, Person> fun2 = Person::new;
        Person person = fun2.apply(22);
    }

    // 数组引用
    @Test
    public void ArrayTest() {
        Function<Integer, Integer[]> fun1 = n -> new Integer[n];
        Function<Integer, Integer[]> fun2 = Integer[]::new;
        Integer[] apply = fun2.apply(2);
        for (Integer integer : apply) {
            System.out.println("integer = " + integer);
        }
    }
}
