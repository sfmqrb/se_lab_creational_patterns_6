import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    @Test
    void KhatmiFlower() {
        AbstractFlower fl = new KhatmiFlower();
        assertSame("Khatmi Flower", fl.getFlower());
    }
    @Test
    void G1Flower() {
        AbstractFlower fl = new G1Flower();
        assertSame("G1 Flower", fl.getFlower());
    }
}