package creational.builderpattern;

public class Computer {
    // Pflichtfelder
    private final String cpu;
    private final int ram;

    // Optionale Felder
    private final int storage;
    private final String gpu;
    private final String operatingSystem;
    private final boolean bluetooth;
    private final boolean wifi;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.operatingSystem = builder.operatingSystem;
        this.bluetooth = builder.bluetooth;
        this.wifi = builder.wifi;
    }

    public static class Builder {
        private final String cpu;
        private final int ram;

        private int storage = 256;
        private String gpu = "Integrated";
        private String operatingSystem = "No OS";
        private boolean bluetooth = false;
        private boolean wifi = true;

        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder operatingSystem(String os) {
            this.operatingSystem = os;
            return this;
        }

        public Builder bluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Builder wifi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Computer: CPU=%s, RAM=%dGB, Storage=%dGB, GPU=%s, OS=%s, Bluetooth=%b, WiFi=%b",
                cpu, ram, storage, gpu, operatingSystem, bluetooth, wifi
        );
    }
}
