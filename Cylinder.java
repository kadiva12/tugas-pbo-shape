public class Cylinder extends Circle {

    private double height;

    public Cylinder(double height, double radius, String color) {
        super(radius, color); // calls Circle's constructor, which calls Shape's
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return calculateArea() * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Cylinder with color " + color + ", volume = " + calculateVolume());
    }
}