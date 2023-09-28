package creationalPatterns.builderPattern.builder;

import creationalPatterns.builderPattern.cars.CarType;
import creationalPatterns.builderPattern.components.Engine;
import creationalPatterns.builderPattern.components.GPSNavigator;
import creationalPatterns.builderPattern.components.Transmission;
import creationalPatterns.builderPattern.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
