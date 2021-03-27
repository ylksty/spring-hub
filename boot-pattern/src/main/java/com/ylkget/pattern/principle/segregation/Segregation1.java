package com.ylkget.pattern.principle.segregation;

/**
 * <p>
 * Segregation1
 * </p>
 *
 * @author joe 2021/3/26 13:51
 */
public class Segregation1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 使用一把
        A a = new A();

        B b = new B();
        a.depend1(b); // A类通过接口去依赖B类
        a.depend2(b);
        a.depend3(b);

        C c = new C();

        D d = new D();
        c.depend1(d); // C类通过接口去依赖(使用)D类
        c.depend4(d);
        c.depend5(d);

    }

    static class A { // A 类通过接口Interface1,Interface2 依赖(使用) B类，但是只会用到1,2,3方法
        public void depend1(Interface1 i) {
            i.operation1();
        }

        public void depend2(Interface2 i) {
            i.operation2();
        }

        public void depend3(Interface2 i) {
            i.operation3();
        }
    }

    static class C { // C 类通过接口Interface1,Interface3 依赖(使用) D类，但是只会用到1,4,5方法
        public void depend1(Interface1 i) {
            i.operation1();
        }

        public void depend4(Interface3 i) {
            i.operation4();
        }

        public void depend5(Interface3 i) {
            i.operation5();
        }
    }

    static class B implements Interface1, Interface2 {
        public void operation1() {
            System.out.println("B 实现了 operation1");
        }

        public void operation2() {
            System.out.println("B 实现了 operation2");
        }

        public void operation3() {
            System.out.println("B 实现了 operation3");
        }

    }

    static class D implements Interface1, Interface3 {
        public void operation1() {
            System.out.println("D 实现了 operation1");
        }

        public void operation4() {
            System.out.println("D 实现了 operation4");
        }

        public void operation5() {
            System.out.println("D 实现了 operation5");
        }
    }

    // 接口1
    interface Interface1 {
        void operation1();

    }

    // 接口2
    interface Interface2 {
        void operation2();

        void operation3();
    }

    // 接口3
    interface Interface3 {
        void operation4();

        void operation5();
    }

}


