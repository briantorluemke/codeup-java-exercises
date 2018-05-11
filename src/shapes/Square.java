package shapes;

public class Square extends Quadrilateral{
    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 2*length + 2*width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public void setLength(double width) {
        this.width = width;
    }

    @Override
    public void setWidth(double length) {
        this.length = length;
    }

    @Override
    public double getWidth() {
        return width;
    }

}
