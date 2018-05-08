package shapes;

public class Square extends Rectangle {
    Square(int side) {
        super(side, side);
    }

    public int getArea() {
        System.out.println("Square's area is: "+(length^2));
        return (length^2);
    }

    public int getPerimeter() {
        System.out.println("Square's perimeter is: "+(length*4));
        return (length*4);
    }
}
