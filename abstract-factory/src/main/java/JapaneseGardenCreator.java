public class JapaneseGardenCreator implements AbstractGardenCreator{
    public AbstractTree tree;
    public AbstractFlower flower;

    public JapaneseGardenCreator() {
        createTree();
        createFlower();
    }
    @Override
    public AbstractFlower createFlower() {
        this.flower = new G1Flower();
        return this.flower;
    }

    @Override
    public AbstractTree createTree() {
        this.tree = new J1Tree();
        return this.tree;
    }

    @Override
    public AbstractFlower getFlower() {
        return this.flower;
    }

    @Override
    public AbstractTree getTree() {
        return this.tree;
    }
}
