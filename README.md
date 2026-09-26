This code implements the class diagrams for Shape, Square, Cylinder, and Circle in Java
For the encapsulation, every field (color, side, radius, height) is private/protected and reachable only through getters/setters
For inheritance, Square extends Shape, Circle extends Shape, and Cylinder extends Circle, it means Cylinder gets color from Shape and radius/calculateArea() from Circle. Circle is the parent class
For polymorphism, there are override in Shape, Square, Circle, and Cylinder class, it means that the parent class (Shape) and the three child class (Square, Circle, and Cylinder) have same method name "public void printInfo()" but with different behavior
