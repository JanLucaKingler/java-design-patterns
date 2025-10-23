package structural.facadepattern.components;

public class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Beamer beamer;
    private SoundSystem sound;
    private Light light;

    public HomeTheaterFacade() {
        this.dvd = new DVDPlayer();
        this.beamer = new Beamer();
        this.sound = new SoundSystem();
        this.light = new Light();
    }

    public void filmStarten(String movie) {
        System.out.println("--- Filmabend beginnt ---");
        light.dimmen(20);
        sound.on();
        sound.setVolume(8);
        beamer.on();
        beamer.setInput("DVD");
        dvd.on();
        dvd.play(movie);
    }

    public void filmBeenden() {
        System.out.println("--- Filmabend beendet ---");
        dvd.stop();
        dvd.off();
        beamer.off();
        sound.off();
        light.an();
    }
}
