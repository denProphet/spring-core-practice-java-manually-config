import appBeans.App;
import appBeans.AppEngine;
import appBeans.Developer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("appEngine.properties")
public class SpringConfig {

    @Bean
    public Developer developer(){
        return new Developer("Den");
    }

    @Bean
    public AppEngine appEngine(){
        return new AppEngine();
    }

    @Bean
    public App app(){
        return new App(developer(),appEngine(),"PhotoFood");
    }
}
