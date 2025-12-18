import java.util.Scanner;
class Rectangle {
    double length;
    double breadth;
    Rectangle() {
        length = 0;
        breadth = 0;
    }
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    double area() {
        return length * breadth;
    }
}
public class arrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.println("Area using default constructor = " + r1.area());
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        Rectangle r2 = new Rectangle(l, b);
        System.out.println("Area using parameterized constructor = " + r2.area());
        sc.close();
    }
}