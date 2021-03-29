package com.ylkget.pattern.builder.car;

import com.ylkget.pattern.builder.car.builders.CarBuilder;
import com.ylkget.pattern.builder.car.builders.CarManualBuilder;
import com.ylkget.pattern.builder.car.products.Car;
import com.ylkget.pattern.builder.car.products.Manual;
import com.ylkget.pattern.builder.car.director.Director;

/**
 * <p>
 * Client
 * </p>
 *
 * @author joe 2021/3/29 09:13
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
