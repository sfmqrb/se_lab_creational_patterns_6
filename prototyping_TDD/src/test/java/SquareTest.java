import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void testClone() {
        Square square1 = new Square();
        square1.len = 5;
        Square square2 = (Square) square1.clone();
        assertNotSame(square1, square2);
        assertEquals(square1.len, square2.len);
    }

    @Test
    void testEquals() {
        Square square1 = new Square();
        square1.len = 5;
        Square square2 = new Square();
        square2.len = 5;
        Square square3 = new Square();
        square3.len = 10;
        assertEquals(square1, square2);
        assertNotEquals(square1, square3);
    }
}
