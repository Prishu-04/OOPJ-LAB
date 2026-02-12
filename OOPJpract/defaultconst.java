import java.util.*;
class student{
     int roll;
     String name;
     student(){
          name="Pratyaksh";
          roll=24155040;
     }
}
public class defaultconst{
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          student stu=new student();
          System.out.println(""+stu.roll+" "+stu.name);
     }
}