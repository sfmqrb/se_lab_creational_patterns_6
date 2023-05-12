import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void createGardenIranian() {
        Client client = new Client(GardenType.Iranian);
        client.createGarden();
        assertTrue(client.tree instanceof ChenarTree);
        assertTrue(client.flower instanceof KhatmiFlower);
    }

    @Test
    void createGardenJapanese() {
        Client client = new Client(GardenType.Japanese);
        client.createGarden();
        assertTrue(client.tree instanceof J1Tree);
        assertTrue(client.flower instanceof G1Flower);
    }
}