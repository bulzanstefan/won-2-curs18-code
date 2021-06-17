package ro.fasttrackit.curs18.first;

import org.springframework.stereotype.Component;

@Component
public class CarService {
    private final EngineFixer engineFixer;

    public CarService(EngineFixer engineFixer) {
        this.engineFixer = engineFixer;
        System.out.println("-------------------- Hello Spring " + engineFixer);
    }

    public String sayHello() {
        engineFixer.fixEngine();
        return "hello from CarService";
    }
}
