import java.io.*;

public class javaio4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("source.dat");
            FileOutputStream fos = new FileOutputStream("destination.dat");

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}