import java.io.*;
import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();
            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter existing file name: ");
            String filename = sc.nextLine();
            FileWriter fw = new FileWriter(filename, true);
            fw.write("Roll No: " + roll + "\n");
            fw.write("Name: " + name + "\n");
            fw.write("Subject: " + subject + "\n");
            fw.write("Marks: " + marks + "\n");
            fw.write("---------------------------\n");
            fw.close();
            System.out.println("\nData written successfully!\n");
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("File Contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}