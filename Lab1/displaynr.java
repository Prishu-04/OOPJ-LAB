import java.util.Scanner;
class displaynr{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Name:");
         String name=sc.nextLine();
         System.out.println("Enter your Rollno:");
         int rollno=sc.nextInt();
         System.out.println("Enter your Section:");
         String section=sc.nextLine();
         System.out.println("Enter your Branch:");
         String branch=sc.nextLine();
         System.out.println("Name - "+name);
          System.out.println("Rollno - "+rollno);
          System.out.println("Section - "+section);
          System.out.println("Branch - "+branch);
          sc.close();
     }
}