import java.util.Scanner;
interface Employee {
    void getDetails();
}
interface Manager extends Employee {
    void getDeptDetails();
}
class Head implements Manager {
    int empId, deptId;
    String empName, deptName;
    Scanner sc = new Scanner(System.in);
    public void getDetails() {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
    }
    public void getDeptDetails() {
        System.out.print("Enter Department ID: ");
        deptId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department Name: ");
        deptName = sc.nextLine();
    }
    void display() {
        System.out.println("\n--- HEAD OF DEPARTMENT DETAILS ---");
        System.out.println("Employee ID    : " + empId);
        System.out.println("Employee Name  : " + empName);
        System.out.println("Department ID  : " + deptId);
        System.out.println("Department Name: " + deptName);
    }
}
public class ques4 {
    public static void main(String[] args) {
        Head h = new Head();
        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}