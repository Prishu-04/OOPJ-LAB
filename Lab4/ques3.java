//-Define an interface with three methods – earnings(), deductions() and bonus()
//and define a Java class ‘Manager’ which uses this interface without implementing bonus() method.
//Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements
//bonus() method. Write the complete program to find out earnings, deduction and bonus of a
//sbstaff with basic salary amount entered by the user as per the following guideliness

import java.util.Scanner;
interface economic {
    double earnings();
    double deductions();
    double bonus();
}
abstract class Manager implements economic {
    double basic;
    Manager(double basic) {
        this.basic = basic;
    }
    public double earnings() {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }
    public double deductions() {
        return 0.12 * basic;
    }
}
class Substaff extends Manager {
    Substaff(double basic) {
        super(basic);
    }
    public double bonus() {
        return 0.50 * basic;
    }
    void display() {
        System.out.println("\n--- SALARY DETAILS ---");
        System.out.println("Basic Salary : " + basic);
        System.out.println("Earnings     : " + earnings());
        System.out.println("Deductions   : " + deductions());
        System.out.println("Bonus        : " + bonus());
    }
}
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        Substaff s = new Substaff(basicSalary);
        s.display();
    }
}