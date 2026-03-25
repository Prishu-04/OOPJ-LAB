import java.io.*;

public class javaio6 {
    public static void main(String[] args) {
        try {
            PrintStream originalOut = System.out;

            PrintStream fileOut = new PrintStream(new FileOutputStream("output_q6.txt"));
            System.setOut(fileOut);

            System.out.println("This line is written to the file.");
            System.out.println("Standard output has been redirected.");

            fileOut.close();

            System.setOut(originalOut);
            System.out.println("Output restored back to console.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}