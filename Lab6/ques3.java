import java.util.Scanner;
class NegativeNumberException extends Exception {
    public NegativeNumberException(String m) {
        super(m);
    }
}
class Processinput {
    public void Processinput(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Number should be positive");
        } else {
            System.out.println("Double value is " + (num * 2));
        }
    }
}
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        Processinput pi = new Processinput();
        try {
            pi.Processinput(num);
        } catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e);
        }
        sc.close();
    }
}
