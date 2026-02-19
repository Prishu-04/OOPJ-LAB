import java.util.Scanner;
class CheckArgument extends Exception {
    public CheckArgument(String m) {
        super(m);
    }
}
public class ques5{
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Check the Arguments");
            }
            int sum = 0;

            // Calculate sum of squares of first 4 arguments
            for (int i = 0; i < 4; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num * num;
            }

            System.out.println(sum);

        } catch (CheckArgument e) {
            System.out.println("Exception occurred - " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }
    }
}