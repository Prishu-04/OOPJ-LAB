import java.io.*;
import java.util.*;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter source file name: ");
            String source = sc.nextLine();
            System.out.print("Enter destination file name: ");
            String destination = sc.nextLine();
            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(destination);
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            fr.close();
            fw.close();
            System.out.println("File Copied");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}