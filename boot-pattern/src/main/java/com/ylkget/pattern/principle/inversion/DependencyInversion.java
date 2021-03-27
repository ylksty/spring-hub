package com.ylkget.pattern.principle.inversion;

/**
 * <p>
 * DependencyInversion
 * </p>
 *
 * @author joe 2021/3/26 14:40
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }

    static class Person {
        public void receive(IReceiver receiver) {
            System.out.println(receiver.getInfo());
        }
    }

    static class Email implements IReceiver {
        @Override
        public String getInfo() {
            return "email: hello world!";
        }
    }
    static class WeiXin implements IReceiver {
        @Override
        public String getInfo() {
            return "weixin: hello world!";
        }
    }
    interface IReceiver {
        String getInfo();
    }
}


