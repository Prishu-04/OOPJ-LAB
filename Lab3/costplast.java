import java.util.Scanner;

// 2D class
class Sheet2D {
    double length;
    double breadth;
    static final double COST_PER_SQFT = 40;

    void get2DDimensions() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length (in ft): ");
        length = sc.nextDouble();
        System.out.print("Enter breadth (in ft): ");
        breadth = sc.nextDouble();
    }

    double calculateCost() {
        double area = length * breadth;
        return area * COST_PER_SQFT;
    }
}

// 3D class inheriting from 2D
class Box3D extends Sheet2D {
    double height;
    static final double COST_PER_CUFT = 60;

    void get3DDimensions() {
        Scanner sc = new Scanner(System.in);
        get2DDimensions();
        System.out.print("Enter height (in ft): ");
        height = sc.nextDouble();
    }

    double calculateCost3D() {
        double volume = length * breadth * height;
        return volume * COST_PER_CUFT;
    }
}

// Main class
public class costplast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Plastic Type:");
        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            Sheet2D sheet = new Sheet2D();
            sheet.get2DDimensions();
            System.out.println("Cost of 2D plastic sheet: Rs " + sheet.calculateCost());
        }
        else if (choice == 2) {
            Box3D box = new Box3D();
            box.get3DDimensions();
            System.out.println("Cost of 3D plastic box: Rs " + box.calculateCost3D());
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
