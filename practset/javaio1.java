import java.io.*;

public class javaio1{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter student name: ");
        String name = br.readLine();

        System.out.print("Enter roll number: ");
        int rollNo = Integer.parseInt(br.readLine());

        System.out.print("Enter marks: ");
        float marks = Float.parseFloat(br.readLine());

        System.out.println("\n----- Student Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Marks      : " + marks);
    }
}