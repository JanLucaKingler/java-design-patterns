package creational.singeltonpattern;

public class AppService {

    public void printAppInfo(){
        ConfigManager configManager = ConfigManager.getInstance();
        System.out.println("Anwendungsname: " + configManager.getAppName());
        System.out.println("Version: " + configManager.getVersion());
    }
}
