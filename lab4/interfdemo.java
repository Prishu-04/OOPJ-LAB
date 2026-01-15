import java.util.Scanner;
interface Employee {
    void earnings();
    void deductions();
    void bonus();
}
abstract class Manager implements Employee {
    double basic;
    Manager(double basic) {
        this.basic = basic;
    }
    public void earnings() {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        double totalEarnings = basic + da + hra;
        System.out.println("Earnings: " + totalEarnings);
    }
    public void deductions() {
        double pf = 0.12 * basic;
        System.out.println("Deductions (PF): " + pf);
    }
}
class Substaff extends Manager {
    Substaff(double basic) {
        super(basic);
    }
    public void bonus() {
        double bonus = 0.50 * basic;
        System.out.println("Bonus: " + bonus);
    }
}
public class interfdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        Substaff s = new Substaff(basic);
        System.out.println("\nSalary Details of Substaff:");
        s.earnings();
        s.deductions();
        s.bonus();
    }
}