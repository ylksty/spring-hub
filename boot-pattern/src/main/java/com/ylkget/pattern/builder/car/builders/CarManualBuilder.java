package com.ylkget.pattern.builder.car.builders;

import com.ylkget.pattern.builder.car.products.CarType;
import com.ylkget.pattern.builder.car.products.Manual;
import com.ylkget.pattern.builder.car.components.Engine;
import com.ylkget.pattern.builder.car.components.GPSNavigator;
import com.ylkget.pattern.builder.car.components.Transmission;
import com.ylkget.pattern.builder.car.components.TripComputer;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/29 09:44
 */
public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
