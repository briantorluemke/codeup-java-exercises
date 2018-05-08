package shapes;

public class Rectangle {
    protected int length;
    protected int width;
    public int perimeter;
    public int area;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
        System.out.println("Created a box with length: "+length+" and width: "+width);
    }

    public int getPerimeter() {
        perimeter = ((2*this.length)+(2*this.width));
        System.out.println("Perimeter is: "+perimeter);
        return ((2*this.length)+(2*this.width));
    }

    public int getArea() {
        area = (this.length*this.width);
        System.out.println("Area is: "+area);
        return area;
    }
}
