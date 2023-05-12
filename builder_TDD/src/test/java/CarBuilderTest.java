import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarBuilderTest {
    @Test
    void reset() {
        CarBuilder builder = new CarBuilder();
        builder.setSeats(2);
        builder.setEngine("v8");
        builder.reset();
        Car car = builder.getProduct();
        assertEquals(0, car.getSeats());
        assertNull(car.getEngine());
        assertFalse(car.hasTripComputer());
        assertFalse(car.hasGPS());
    }

    @Test
    void setSeats() {
        CarBuilder builder = new CarBuilder();
        builder.setSeats(4);
        Car car = builder.getProduct();
        assertEquals(4, car.getSeats());
    }

    @Test
    void setEngine() {
        CarBuilder builder = new CarBuilder();
        builder.setEngine("v6");
        Car car = builder.getProduct();
        assertEquals("v6", car.getEngine());
    }

    @Test
    void setTripComputer() {
        CarBuilder builder = new CarBuilder();
        builder.setTripComputer(true);
        Car car = builder.getProduct();
        assertTrue(car.hasTripComputer());
    }

    @Test
    void setGPS() {
        CarBuilder builder = new CarBuilder();
        builder.setGPS(true);
        Car car = builder.getProduct();
        assertTrue(car.hasGPS());
    }

    @Test
    void getProduct() {
        CarBuilder builder = new CarBuilder();
        builder.setSeats(2);
        builder.setEngine("v8");
        builder.setTripComputer(true);
        builder.setGPS(true);
        Car car = builder.getProduct();
        assertEquals(2, car.getSeats());
    }
}
