import java.util.Objects;

public abstract class Shape {
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return Objects.equals(shape2.color, color);
    }
}

