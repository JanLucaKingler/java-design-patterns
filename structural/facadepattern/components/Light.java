package structural.facadepattern.components;

public class Light {
    public void dimmen(int level) {
        System.out.println("Licht auf " + level + "% dimmen.");
    }

    public void an() {
        System.out.println("Licht einschalten.");
    }

    public void aus(){
        System.out.println("Licht ausschalten");
    }
}
