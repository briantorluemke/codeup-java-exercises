package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        box1.getPerimeter();
        box1.getArea();
        Rectangle box2 = new Square(5);
        box2.getPerimeter();
        box2.getArea();
    }
}
