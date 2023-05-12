public class IranianGardenCreator implements AbstractGardenCreator{
    public AbstractTree tree;
    public AbstractFlower flower;

    public IranianGardenCreator() {
        createTree();
        createFlower();
    }

    @Override
    public AbstractFlower createFlower() {
        this.flower = new KhatmiFlower();
        return this.flower;
    }

    @Override
    public AbstractTree createTree() {
        this.tree = new ChenarTree();
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
