class Shape {
    public void displayShape() {
        System.out.println("Displaying shape");
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.displayShape();
        System.out.println("Circle area: " + circle.area());

        rectangle.displayShape();
        System.out.println("Rectangle area: " + rectangle.area());
    }
}