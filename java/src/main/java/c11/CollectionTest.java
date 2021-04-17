package c11;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/4/14 11:16
 */
public class CollectionTest {
    // 数组 -> 集合
    @Test
    public void notice1() {
        List arr1 = Arrays.asList(new int[]{123, 456}); // new 一个数组元素
        System.out.println(arr1);
        List<Integer> arr2 = Arrays.asList(new Integer[]{123, 456}); // new 一个数组
        System.out.println(arr2);
    }

    // 集合 -> 数组
    @Test
    public void notice2() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abc");
        arrayList.add("123");
        Object[] objects = arrayList.toArray();
        Arrays.stream(objects).forEach(System.out::println);
    }
}
