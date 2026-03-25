import java.io.*;
public class javaiopract2{
     public static void main(String[] args)throws IOException{
          BufferedWriter br=new BufferedWriter(new OutputStreamWriter(System.out));
          br.write("Hello World");
          br.newLine();
          args[1]="Welcome to Java Programming";
          br.write(args[1]);
          br.flush();
     }
}