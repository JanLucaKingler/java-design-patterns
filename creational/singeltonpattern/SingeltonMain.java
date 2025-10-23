package creational.singeltonpattern;

public class SingeltonMain {
    static void main() {
        AppService appService = new AppService();
        AppService appService2 = new AppService();


        appService.printAppInfo();
        appService2.printAppInfo();

        ConfigManager configManager = ConfigManager.getInstance();
        ConfigManager configManager2 = ConfigManager.getInstance();

        if (configManager == configManager2) {
            System.out.println("Same instance");
        }else  {
            System.out.println("Different instance");
        }
    }
}
