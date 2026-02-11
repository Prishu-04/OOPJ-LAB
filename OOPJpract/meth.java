import java.util.*;
class sum{
     int a,b;
     int add(){
          int sum=a+b;
          return sum;
     }
}
public class meth{
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number:");
          sum s=new sum();
          s.a=sc.nextInt();
          s.b=sc.nextInt();
          System.out.println("Sum="+s.add());
     }
}