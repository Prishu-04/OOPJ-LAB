import java.util.Scanner;
class ObjectCounter {
    static int count = 0;
    ObjectCounter() {
        count++;
    }
    static void displayCount() {
        System.out.println("Number of objects created = " + count);
    }
}
public class countobj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of objects to create: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            new ObjectCounter();
        }
        ObjectCounter.displayCount();
        sc.close();
    }
}