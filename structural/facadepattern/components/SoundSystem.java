package structural.facadepattern.components;

public class SoundSystem {
    public void on() {
        System.out.println("Soundsystem einschalten.");
    }

    public void setVolume(int level) {
        System.out.println("Lautstärke auf " + level + " setzen.");
    }

    public void off() {
        System.out.println("Soundsystem ausschalten.");
    }
}
