import java.io.*;
public class javaiopract3{
     public static void main(String[] args){
          try{
               FileReader f1=new FileReader("q.txt");
               FileWriter f2=new FileWriter("o.txt");
               int c;
               while((c=f1.read())!=-1){
                    f2.write((char)c);
                    System.out.print((char)c);
               }
               f1.close();
               f2.close();
          } catch (IOException e) {
               System.out.println("An error occurred.");
          }
     }
}