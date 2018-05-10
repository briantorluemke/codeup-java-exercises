package shapes;

public class Square extends Quadrilateral implements Measurable{
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
    void setWidth() {

    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setLength() {

    }
}
