package creational.singeltonpattern;

public class ConfigManager {

    private static ConfigManager instance;
    private String appName;
    private String version;

    private ConfigManager() {
        this.appName = "FlightSimulator";
        this.version = "1.0";
        System.out.println("Creating " + this.appName + " version " + this.version);
    }

    public static synchronized ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }


    public String getAppName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }
}