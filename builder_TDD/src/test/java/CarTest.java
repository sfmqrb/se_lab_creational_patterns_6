import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void setSeats(){
        Car car = new Car();
        car.setSeats(4);
        assertEquals(4, car.getSeats());
    }

    @Test
    void setEngine() {
        Car car = new Car();
        car.setEngine("V8");
        assertEquals("V8", car.getEngine());
    }

    @Test
    void setTripComputer() {
        Car car = new Car();
        car.setTripComputer(true);
        assertTrue(car.hasTripComputer());
    }

    @Test
    void setGPS() {
        Car car = new Car();
        car.setGPS(true);
        assertTrue(car.hasGPS());
    }

    @Test
    void testToString() {
        Car car = new Car();
        car.setSeats(4);
        car.setEngine("V8");
        car.setTripComputer(true);
        car.setGPS(true);
        assertEquals("Car [seats=4, engine=V8, tripComputer=true, gps=true]", car.toString());
    }
}
