package com.ylkget.pattern.singleton;

/**
 * <p>
 * Singleton5 懒汉式(线程安全，同步代码块)
 * </p>
 *
 * @author joe 2021/3/27 10:13
 */
public class Singleton5 {
    public static void main(String[] args) {
        System.out.println("懒汉式2 ， 线程安全~");
        Singleton4.Singleton instance = Singleton4.Singleton.getInstance();
        Singleton4.Singleton instance2 = Singleton4.Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
    // 懒汉式(线程安全，同步代码块)
    static class Singleton {
        private static Singleton instance;

        private Singleton() {}

        public static Singleton getInstance() {
            if(instance == null) {
                synchronized (Singleton.class) {
                    instance = new Singleton();
                }
            }
            return instance;
        }
    }
}
