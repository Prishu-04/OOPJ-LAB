import java.util.Scanner;
class Box {
    double length;
    double width;
    double height;
    double volume() {
        return length * width * height;
    }
}
public class volobj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        Box b = new Box();
        b.length = length;
        b.width = width;
        b.height = height;
        System.out.println("Volume of the box = " + b.volume());
        sc.close();
    }
}