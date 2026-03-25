import java.io.*;

public class javaio2{
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Avipsha Banerjee");
        bw.newLine();
        bw.write("Room No. 72, Girls Hostel");
        bw.newLine();
        bw.write("Bhubaneswar, Odisha");
        bw.newLine();
        bw.write("India - 751024");
        bw.newLine();

        bw.flush();
    }
}