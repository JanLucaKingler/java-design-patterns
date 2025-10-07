package creational.factorypattern.factory;

import creational.factorypattern.car.Car;
import creational.factorypattern.car.SUV;
import creational.factorypattern.car.SportCar;

public class CarFactory {

    public enum CarType {
        SPORT,
        SUV
    }

    public static Car createCar(CarType type) {
        return switch (type) {
            case SPORT -> new SportCar();
            case SUV -> new SUV();
            default -> throw new IllegalArgumentException("Unknown car type: " + type);
        };
    }
}

