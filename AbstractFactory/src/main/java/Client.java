public class Client {
    AbstractGardenCreator gc;
    GardenType gardenType;
    public AbstractTree tree;
    public AbstractFlower flower;

    public Client(GardenType gardenType) {
        this.gardenType = gardenType;
    }

    public void createGarden() {
        if (gardenType == GardenType.Iranian) {
            gc = new IranianGardenCreator();
        } else {
            gc = new JapaneseGardenCreator();
        }
        this.tree = gc.getTree();
        this.flower = gc.getFlower();
    }
}
