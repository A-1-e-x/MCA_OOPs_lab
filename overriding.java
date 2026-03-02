class Shape {
    void calculateArea() {
        System.out.println("Calculating area...");
    }
}

class Rectangle extends Shape {
    void calculateArea() {
        double length = 10, width = 5;
        System.out.println("Area of Rectangle = " + (length * width));
    }
}

class Square extends Shape {
    void calculateArea() {
        double side = 4;
        System.out.println("Area of Square = " + (side * side));
    }
}

class Circle extends Shape {
    void calculateArea() {
        double radius = 7;
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

public class overriding {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        Shape s = new Square();
        Shape c = new Circle();

        r.calculateArea();
        s.calculateArea();
        c.calculateArea();
    }
}
