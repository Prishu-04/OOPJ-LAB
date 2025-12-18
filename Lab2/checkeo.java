import java.util.Scanner;
public class checkeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Enter 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
        sc.close();
    }
}
