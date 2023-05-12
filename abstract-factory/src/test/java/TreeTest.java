import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
    @Test
    void chenarTree() {
        AbstractTree tree = new ChenarTree();
        assertSame("Chenar Tree", tree.getTree());
    }
    @Test
    void J1Tree() {
        AbstractTree tree = new J1Tree();
        assertSame("J1 Tree", tree.getTree());
    }
}