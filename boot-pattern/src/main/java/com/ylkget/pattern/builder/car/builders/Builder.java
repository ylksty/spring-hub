package com.ylkget.pattern.builder.car.builders;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/29 09:17
 */

import com.ylkget.pattern.builder.car.products.CarType;
import com.ylkget.pattern.builder.car.components.Engine;
import com.ylkget.pattern.builder.car.components.GPSNavigator;
import com.ylkget.pattern.builder.car.components.Transmission;
import com.ylkget.pattern.builder.car.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
