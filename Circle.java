public class Circle extends Shape {

    private double radius;
    public static final double PI = 3.14159; // class constant

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Circle with color " + color + ", area = " + calculateArea());
    }
}