package structural.facadepattern.components;

public class Beamer {
    public void on() {
        System.out.println("Beamer einschalten.");
    }

    public void setInput(String source) {
        System.out.println("Beamer-Eingang auf " + source + " setzen.");
    }

    public void off() {
        System.out.println("Beamer ausschalten.");
    }
}
