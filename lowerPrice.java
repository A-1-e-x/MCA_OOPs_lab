import java.util.Scanner;

class product {
    int pcode;
    String pname;
    double price;

    product(int c, String n, double p) {
        pcode = c;
        pname = n;
        price = p;
    }
}

public class lowerPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of product1:");
        System.out.print("Code: ");
        int c1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String n1 = sc.nextLine();
        System.out.print("Price: ");
        double p1 = sc.nextDouble();

        System.out.println("\nEnter the details of product2:");
        System.out.print("Code: ");
        int c2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String n2 = sc.nextLine();
        System.out.print("Price: ");
        double p2 = sc.nextDouble();

        System.out.println("\nEnter the details of product3:");
        System.out.print("Code: ");
        int c3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String n3 = sc.nextLine();
        System.out.print("Price: ");
        double p3 = sc.nextDouble();

        product pro1 = new product(c1, n1, p1);
        product pro2 = new product(c2, n2, p2);
        product pro3 = new product(c3, n3, p3);

        product lowest = pro1;

        if (pro2.price < lowest.price) {
            lowest = pro2;
        }
        if (pro3.price < lowest.price) {
            lowest = pro3;
        }

        System.out.println("\nProduct with lowest price:");
        System.out.println("Code: " + lowest.pcode);
        System.out.println("Name: " + lowest.pname);
        System.out.println("Price: " + lowest.price);
    }
}

