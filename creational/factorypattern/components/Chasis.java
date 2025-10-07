package creational.factorypattern.car;

import creational.factorypattern.components.Chassis;
import creational.factorypattern.components.Engine;
import creational.factorypattern.components.Tire;

public class SUV extends Car {

    public SUV() {
        this.engine = new Engine("V6 Diesel");
        this.chassis = new Chassis("Steel");
        this.tire = new Tire(18);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling an SUV...");
    }
}
