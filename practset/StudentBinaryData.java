import java.io.*;
public class javaio5 {
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"));

            dos.writeInt(101);
            dos.writeFloat(87.5f);

            dos.writeInt(102);
            dos.writeFloat(91.0f);

            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"));

            System.out.println("Stored Student Data:");
            while (dis.available() > 0) {
                int roll = dis.readInt();
                float marks = dis.readFloat();

                System.out.println("Roll No: " + roll + ", Marks: " + marks);
            }

            dis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}