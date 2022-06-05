package appBeans;

import org.springframework.beans.factory.annotation.Value;

public class AppEngine {
    @Value("${appEngine.name}")
    private String name;
    @Value("${appEngine.version}")
    private double version;

    public AppEngine(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public AppEngine() {

    }

    @Override
    public String toString() {
        return "AppEngine{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
