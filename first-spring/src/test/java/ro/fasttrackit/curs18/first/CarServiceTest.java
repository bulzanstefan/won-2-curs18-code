package ro.fasttrackit.curs18.first;

import org.junit.jupiter.api.Test;

class CarServiceTest {

    @Test
    void testingCarService() {
        CarService carService = new CarService(new EngineFixer());

        carService.sayHello();
    }

}
