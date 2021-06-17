package ro.fasttrackit.curs18.first;

import org.springframework.stereotype.Component;

@Component
public class EngineFixer {
    public EngineFixer(){
        System.out.println("Constructor EngineFixer");
    }
    void fixEngine() {
        System.out.println("Fixing engine");
    }
}
