import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        boolean running = true;
        while (running) {
            System.out.println("\n===== SHAPE MENU =====");
            System.out.println("1. Add a Square");
            System.out.println("2. Add a Circle");
            System.out.println("3. Add a Cylinder");
            System.out.println("4. Print info for all shapes (polymorphism demo)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1": {
                    System.out.print("Enter side length: ");
                    double side = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();

                    Square sq = new Square(side, color);
                    shapes.add(sq);

                    System.out.println("Created square -> side: " + sq.getSide()
                            + ", color: " + sq.getColor()
                            + ", area: " + sq.calculateArea());
                    break;
                }
                case "2": {
                    System.out.print("Enter radius: ");
                    double radius = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();

                    Circle c = new Circle(radius, color);
                    shapes.add(c);

                    System.out.println("Created circle -> radius: " + c.getRadius()
                            + ", color: " + c.getColor()
                            + ", area: " + c.calculateArea());
                    break;
                }
                case "3": {
                    System.out.print("Enter height: ");
                    double height = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter radius: ");
                    double radius = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();

                    Cylinder cyl = new Cylinder(height, radius, color);
                    shapes.add(cyl);

                    System.out.println("Created cylinder -> height: " + cyl.getHeight()
                            + ", radius: " + cyl.getRadius() // inherited from Circle
                            + ", color: " + cyl.getColor()   // inherited from Shape
                            + ", volume: " + cyl.calculateVolume());
                    break;
                }
                case "4": {
                    if (shapes.isEmpty()) {
                        System.out.println("No shapes yet. Add some first!");
                    } else {
                        System.out.println("--- Polymorphism in action ---");
                        for (Shape shape : shapes) {
 
                            shape.printInfo();
                        }
                    }
                    break;
                }
                case "5":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }

        scanner.close();
    }
}