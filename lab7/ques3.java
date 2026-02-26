import java.io.*;

public class ques3 {
    public static void main(String[] args) {
        String file1 = "q2src.txt";
        String file2 = "q2dest.txt";
        try {
            FileInputStream fis1 = new FileInputStream(file1);
            FileInputStream fis2 = new FileInputStream(file2);
            int byte1, byte2;
            int position = 1;
            boolean areEqual = true;
            while (true) {
                byte1 = fis1.read();
                byte2 = fis2.read();
                if (byte1 != byte2) {
                    areEqual = false;
                    System.out.println("Two files are not equal.");
                    System.out.println("First difference at byte position: " + position);
                    break;
                }
                if (byte1 == -1 && byte2 == -1) {
                    break;
                }
                position++;
            }
            if (areEqual) {
                System.out.println("Two files are equal.");
            }
            fis1.close();
            fis2.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}