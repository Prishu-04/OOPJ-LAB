import java.util.Scanner;
abstract class student {
    int rollNo;
    int regNo;
    void getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter Registration Number: ");
        regNo = sc.nextInt();
    }
    abstract void course();
}
class kiitian extends student {
    String courseName;
    void course() {
        courseName = "B.Tech";
    }
    void display() {
        System.out.println("\n--- KIITIAN DETAILS ---");
        System.out.println("Roll Number       : " + rollNo);
        System.out.println("Registration No   : " + regNo);
        System.out.println("Course            : " + courseName);
    }
}
public class ques1 {
    public static void main(String[] args) {
        kiitian k = new kiitian();
        k.getinput();
        k.course();
        k.display();
    }
}
