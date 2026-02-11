import java.util.Scanner;
class Plate {
    double length, width;
    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate Constructor Called");
        System.out.println("Length = " + length + ", Width = " + width);
    }
}
class Box extends Plate {
    double height;
    Box(double l, double w, double h) {
        super(l, w);
        height = h;
        System.out.println("Box Constructor Called");
        System.out.println("Height = " + height);
    }
}
class WoodBox extends Box {
    double thick;
    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        thick = t;
        System.out.println("WoodBox Constructor Called");
        System.out.println("Thickness = " + thick);
    }
}
public class multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        System.out.print("Enter thickness: ");
        double t = sc.nextDouble();
        System.out.println("\n--- Constructor Execution Output ---");
        WoodBox wb = new WoodBox(l, w, h, t);
    }
}
