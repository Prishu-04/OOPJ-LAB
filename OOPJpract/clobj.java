import java.util.*;
class student{
     int rollno;
     String name;
}
public class clobj{
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter your rollno:");
          int rollno=sc.nextInt();
          System.out.println("Enter your Name:");
          sc.nextLine();
          String name=sc.nextLine();
          student stu=new student();
          stu.rollno=rollno;
          stu.name=name;
          System.out.println("Rollno:"+stu.rollno);
          System.out.println("Student:"+stu.name);
     }
}