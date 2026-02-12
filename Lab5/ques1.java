import java.util.Scanner;
import General.Employee;
import Marketing.sales;
public class ques1{
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the employee id and employee name:");
          int empid=sc.nextInt();
          String empname=sc.nextLine();
          System.out.println("Enter the basic salary:");
          double basic=sc.nextDouble();
          sales sale=new sales(empid,empname,basic);
          System.out.println("Empid of the employee:"+sale.getempid());
          System.out.println("Total earning :"+sale.earning());
     }
}