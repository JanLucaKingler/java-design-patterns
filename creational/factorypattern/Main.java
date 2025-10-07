package creational.factorypattern;

import creational.factorypattern.car.Car;
import creational.factorypattern.factory.CarFactory;

public class Main {
    static void main(String[] args) {
        Car sportCar = CarFactory.createCar(CarFactory.CarType.SPORT);
        sportCar.assemble();
        sportCar.showSpecs();

        System.out.println();

        Car suv = CarFactory.createCar(CarFactory.CarType.SUV);
        suv.assemble();
        suv.showSpecs();
    }
}

