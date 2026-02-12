package Marketing; 
import General.Employee;
public class sales extends Employee{
     public sales(int empid,String empname,double basic){
          super(empid,empname,basic);
     }
     public double tallowance(){
          return 0.05*earning();
     }
}