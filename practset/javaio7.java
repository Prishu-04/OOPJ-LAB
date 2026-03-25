import java.io.*;
public class javaio7 {
    public static void main(String[] args) {
        try {
            String name = "Rahul";
            int rollNo = 101;
            int m1 = 85, m2 = 78, m3 = 92;
            int total = m1 + m2 + m3;
            double percentage = total / 3.0;
            String grade;
            if (percentage >= 90)
                grade = "A+";
            else if (percentage >= 80)
                grade = "A";
            else if (percentage >= 70)
                grade = "B";
            else if (percentage >= 60)
                grade = "C";
            else if (percentage >= 50)
                grade = "D";
            else
                grade = "F";
            PrintWriter pw = new PrintWriter(new FileWriter("report.txt"));
            pw.println("========== STUDENT RESULT REPORT ==========");
            pw.printf("%-15s: %s%n", "Name", name);
            pw.printf("%-15s: %d%n", "Roll Number", rollNo);
            pw.println("-------------------------------------------");
            pw.printf("%-15s%-10s%n", "Subject", "Marks");
            pw.println("-------------------------------------------");
            pw.printf("%-15s%-10d%n", "Math", m1);
            pw.printf("%-15s%-10d%n", "Science", m2);
            pw.printf("%-15s%-10d%n", "English", m3);
            pw.println("-------------------------------------------");
            pw.printf("%-15s: %d%n", "Total", total);
            pw.printf("%-15s: %.2f%n", "Percentage", percentage);
            pw.printf("%-15s: %s%n", "Grade", grade);
            pw.println("===========================================");
            pw.close();
            System.out.println("Report generated successfully in report.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}