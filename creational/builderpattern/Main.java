import creational.builderpattern.Computer;

void main() {
    Computer gamingPC = new Computer.Builder("Intel i9", 32)
            .storage(2000)
            .gpu("NVIDIA RTX 4080")
            .operatingSystem("Windows 11")
            .wifi(false)
            .bluetooth(true)
            .build();

    Computer officePC = new Computer.Builder("AMD Ryzen 5", 16)
            .storage(512)
            .operatingSystem("Ubuntu Linux")
            .build();

    System.out.println(gamingPC);
    System.out.println(officePC);
}
