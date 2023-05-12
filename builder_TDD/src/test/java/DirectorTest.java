import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectorTest {
    @Test
    void constructSportsCar() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        director.constructSportsCar(builder);
        Car car = builder.getProduct();

        assertEquals(car.getSeats(), 2);
        assertEquals(car.getEngine(), "SportEngine");
        assertTrue(car.hasTripComputer());
        assertTrue(car.hasGPS());
    }
}
