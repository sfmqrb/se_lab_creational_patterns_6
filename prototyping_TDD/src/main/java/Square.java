
public class Square extends Shape {
    public int len;
    public Square() {
    }

    public Square(Square target) {
        super(target);
        if (target != null) {
            this.len = target.len;
        }
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Square) || !super.equals(object2)) return false;
        Square shape2 = (Square) object2;
        return shape2.len == len;
    }
}