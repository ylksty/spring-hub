package com.ylkget.pattern.builder.car.components;

import com.ylkget.pattern.builder.car.products.Car;

/**
 * <p>
 * 里程计算
 * </p>
 *
 * @author joe 2021/3/29 09:30
 */
public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
