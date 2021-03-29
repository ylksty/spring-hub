package com.ylkget.pattern.builder.car.director;

import com.ylkget.pattern.builder.car.builders.Builder;
import com.ylkget.pattern.builder.car.products.CarType;
import com.ylkget.pattern.builder.car.components.Engine;
import com.ylkget.pattern.builder.car.components.GPSNavigator;
import com.ylkget.pattern.builder.car.components.Transmission;
import com.ylkget.pattern.builder.car.components.TripComputer;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/29 09:15
 */
public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
