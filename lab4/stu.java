import java.util.Scanner;
abstract class Student {
    int rollNo;
    int regNo;
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter Registration Number: ");
        regNo = sc.nextInt();
    }
    abstract void course();
}
class kiitian extends Student {
    void course() {
        System.out.println("Course: B.Tech");
    }
    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Registration Number: " + regNo);
        course();
    }
}
public class stu {
    public static void main(String[] args) {
        kiitian k = new kiitian();
        k.getInput();
        System.out.println("\nStudent Details:");
        k.display();
    }
}