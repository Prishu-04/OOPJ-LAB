import java.io.*;

public class javaio3 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("q2src.txt");
            FileWriter fw = new FileWriter("output.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(Character.toUpperCase((char) ch));
            }

            fr.close();
            fw.close();

            System.out.println("File copied successfully in uppercase.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}