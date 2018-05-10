package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(5);
        System.out.println("Your shape with a width of "+myShape.getWidth()+ "\n" +
                "and a length of "+myShape.getLength()+ ",\n" +
                "has an area of: " +myShape.getArea()+",\n" +
                "and a perimeter of: "+myShape.getPerimeter());
    }
}