import java.io.*;
import java.util.*;
public class javaiopract1{
     public static void main(String[] args) throws IOException{
          BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the student name:");
          String name=br.readLine();
          System.out.println("Enter your roll no:");
          int roll=Integer.parseInt(br.readLine());
          System.out.println("Enter your marks:");
          float marks=Float.parseFloat(br.readLine());
          System.out.println(name+" "+roll+" "+marks);
     }
}