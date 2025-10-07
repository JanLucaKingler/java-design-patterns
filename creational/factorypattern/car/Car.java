package creational.factorypattern.car;

import creational.factorypattern.components.Chassis;
import creational.factorypattern.components.Engine;
import creational.factorypattern.components.Tire;

public abstract class Car {
    protected Engine engine;
    protected Chassis chassis;
    protected Tire tire;

    public abstract void assemble();

    public void showSpecs() {
        System.out.println("Engine: " + engine.getType());
        System.out.println("Chassis: " + chassis.getMaterial());
        System.out.println("Tire size: " + tire.getSize() + " inch");
    }
}
