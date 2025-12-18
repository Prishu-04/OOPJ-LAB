import java.util.Scanner;
class Student {
    int roll;
    String name;
    double cgpa;
    void read(Scanner sc) {
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }
    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("----------------------");
    }
}
public class sturecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            s[i] = new Student();
            s[i].read(sc);
        }
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < s[minIndex].cgpa) {
                minIndex = i;
            }
        }
        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }
        System.out.println("Student with lowest CGPA:");
        System.out.println(s[minIndex].name);
        sc.close();
    }
}