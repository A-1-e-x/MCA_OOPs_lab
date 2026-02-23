import java.util.Scanner;

class area {

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double side) {
        return side * side;
    }

    double area(float radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        area obj = new area();

        System.out.println("Enter length and breadth of rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println("Area of Rectangle: " + obj.area(length, breadth));

        System.out.println("\nEnter side of square:");
        double side = sc.nextDouble();
        System.out.println("Area of Square: " + obj.area(side));

        System.out.println("\nEnter radius of circle:");
        float radius = sc.nextFloat();
        System.out.println("Area of Circle: " + obj.area(radius));

        sc.close();
    }
}
