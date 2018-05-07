package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        System.out.println("Creating your circle.");
        System.out.println("         ***\n" +
                "     *         *\n" +
                "   *             *\n" +
                "  *               *\n" +
                " *                 *\n" +
                " *        o--------*  <--(radius: "+radius+")\n" +
                " *                 *\n" +
                "  *               *\n" +
                "   *             *\n" +
                "     *         *\n" +
                "         ***");
        System.out.println("Circle created!");
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * (this.radius*this.radius);
        System.out.println("The area of your circle is: " + area);
        return area;
    }

    public double getCircumference() {
        double circ = 2 * Math.PI * this.radius;
        System.out.println("The circumference of your circle is: " + circ);
        return circ;
    }
}