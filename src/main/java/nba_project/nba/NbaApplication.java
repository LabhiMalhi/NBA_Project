package nba_project.nba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class NbaApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("nba_project.nba");
        Game bean = context.getBean(Game.class);
        System.out.println("Winnere --> " + bean.playGame().getTeamName());

    }

}
