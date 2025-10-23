package structural.facadepattern.components;

public class DVDPlayer {
    public void on() {
        System.out.println("DVD-Player einschalten.");
    }

    public void play(String movie) {
        System.out.println("Film " + movie + " wird abgespielt.");
    }

    public void stop() {
        System.out.println("Film wird gestoppt.");
    }

    public void off() {
        System.out.println("DVD-Player ausschalten.");
    }
}
