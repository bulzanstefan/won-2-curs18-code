package ro.fasttrackit.curs18.first;

import org.springframework.stereotype.Service;

@Service
public class TrainService {
    private final EngineFixer engineFixer;

    public TrainService(EngineFixer engineFixer) {
        System.out.println("TrainService: " + engineFixer);
        this.engineFixer = engineFixer;
    }
}
