package c11;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/4/14 11:49
 */
public class IteratorTest {
    @Test
    public void test1() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abc");
        arrayList.add("joe");
        arrayList.add("123");
        arrayList.add("hello");

        // 遍历方法一
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
            if(obj.equals("joe")) {
                // 遍历中删除
                iterator.remove();
            }
        }
        System.out.println(arrayList);

        // 遍历方法二
        Iterator iterator2 = arrayList.iterator();
        iterator2.forEachRemaining(System.out::println);

        // 遍历三 增强for循环（内部还是迭代器）
        for (String obj : arrayList) {
            System.out.println("增强：obj = " + obj);
        }
    }

    @Test
    public void test2() {
        // 增强for循环 遍历数组
        int[] ints = {1, 2, 3, 4, 5};
        for (int i : ints) {
            System.out.println("i = " + i);
        }
    }
}
