import java.util.*;
interface economic{
    double earning(int x);
    double deduction(int x);
    double bonus(int x);
}
abstract class Manager implements economic{
    double salary;
    Manager(double salary) {
        this.salary = salary;
    }
    public double earning(int salary){
        double earning =salary+(0.8*salary)+(0.15*salary);
        return earning;
    }
    public double deduction(int salary){
        double deduction=0.12*salary;
        return deduction;
    }
}
class substaff extends Manager{
    substaff(int salary) {
        super(salary);
    }
    public double bonus(int salary){
        double bonus=0.5*salary;
        return bonus;
    }
}
public class code4{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Basic Salary:");
        int salary=sc.nextInt();
        substaff sub=new substaff(salary);
        System.out.println("Earning:"+sub.earning(salary));
        System.out.println("Deduction:"+sub.deduction(salary));
        System.out.println("Bonus:"+sub.bonus(salary));
        sc.close();
    }
}