import java.util.*;
class Array1 {
    int n;
    int arr[];

    void create() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }
    void display() {
        System.out.println("1D Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
class MultiArray {
    int r, c;
    int arr[][];
    void create() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        c = sc.nextInt();
        arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
    void display() {
        System.out.println("2D Array elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class ques1 {
    public static void main(String[] args) {
        Array1 a1 = new Array1();
        a1.create();
        a1.display();
        System.out.println();
        MultiArray m1 = new MultiArray();
        m1.create();
        m1.display();
    }
}
