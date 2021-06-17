package ro.fasttrackit.curs18.first;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringApplication.class, args);
    }

    @Bean
    CommandLineRunner atStartup(ApplicationContext context) {
        return args -> {
            CarService carServiceBean = context.getBean(CarService.class);
            System.out.println(carServiceBean.sayHello());
        };
    }

}
