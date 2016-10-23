package yanwtedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Winter Young
 * @since 2016/10/23
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(App.class);
        application.run(args);
    }
}
