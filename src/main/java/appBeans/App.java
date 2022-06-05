package appBeans;

public class App {
    private Developer developer;
    private AppEngine appEngine;
    private String name;

    public App(Developer developer, AppEngine appEngine, String name) {
        this.developer = developer;
        this.appEngine = appEngine;
        this.name = name;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public AppEngine getAppEngine() {
        return appEngine;
    }

    public void setAppEngine(AppEngine appEngine) {
        this.appEngine = appEngine;
    }

    @Override
    public String toString() {
        return "App{" +
                "developer=" + developer +
                ", appEngine=" + appEngine +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
