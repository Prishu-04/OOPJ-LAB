import java.util.Scanner;
class Rectangle {
    double length;
    double breadth;
    double area;
    double perimeter;
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }
    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }
    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}
public class arperirect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        Rectangle r = new Rectangle(l, b);
        r.calculate();
        r.display();
        sc.close();
    }
}