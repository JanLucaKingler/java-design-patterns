package creational.factorypattern.car;

import creational.factorypattern.components.Chassis;
import creational.factorypattern.components.Engine;
import creational.factorypattern.components.Tire;

public class SportCar extends Car {

    public SportCar() {
        this.engine = new Engine("V8 Turbo");
        this.chassis = new Chassis("Carbon Fiber");
        this.tire = new Tire(20);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling a sport car...");
    }
}

