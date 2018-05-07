package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        boolean val;
        do {
            System.out.println("The number you're about to be prompted for \nis the number that will represent the radius of your circle.");
            Circle circle = new Circle(input.getDouble());
            circle.getArea();
            circle.getCircumference();
            System.out.println("Make another circle?");
            val = input.yesNo();
        } while (val);
    }
}