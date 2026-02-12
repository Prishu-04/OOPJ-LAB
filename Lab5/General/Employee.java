package General;
public class Employee {
     protected int empid;
     private String ename;    
     protected double basic;
     public Employee(int empid,String ename,double basic){
          this.empid=empid;
          this.ename=ename;
          this.basic=basic;
     }
     public double earning(){
          double sal=basic+(0.8*basic)+(0.15*basic);
          return sal;
     }
     public int getempid(){
          return empid;
     }
}