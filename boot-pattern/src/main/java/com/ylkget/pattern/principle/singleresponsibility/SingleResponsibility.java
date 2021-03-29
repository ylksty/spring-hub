package com.ylkget.pattern.principle.singleresponsibility;

/**
 * <p>
 * 单一职责
 * </p>
 *
 * @author joe 2021/3/26 12:08
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vehicle2 vehicle2  = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runWater("轮船");
        vehicle2.runAir("飞机");
    }
    static class Vehicle2 {
        public void run(String vehicle) {
            //处理

            System.out.println(vehicle + " 在公路上运行....");

        }

        public void runAir(String vehicle) {
            System.out.println(vehicle + " 在天空上运行....");
        }

        public void runWater(String vehicle) {
            System.out.println(vehicle + " 在水中行....");
        }
    }
}
