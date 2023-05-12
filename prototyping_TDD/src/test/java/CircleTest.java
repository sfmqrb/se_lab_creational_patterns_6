import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testClone() {
        Circle circle1 = new Circle();
        circle1.radius = 5;
        Circle circle2 = (Circle) circle1.clone();
        assertNotSame(circle1, circle2);
        assertEquals(circle1.radius, circle2.radius);
    }

    @Test
    void testEquals() {
        Circle circle1 = new Circle();
        circle1.radius = 5;
        Circle circle2 = new Circle();
        circle2.radius = 5;
        Circle circle3 = new Circle();
        circle3.radius = 10;
        assertEquals(circle1, circle2);
        assertNotEquals(circle1, circle3);
    }
}