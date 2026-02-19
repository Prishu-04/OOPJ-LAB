import java.util.Scanner;
public class ques2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        try{
            int div=num1/num2;
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught: "+e);
        }
        finally {
            System.out.println("Finally block executed.");
            sc.close();
        }
    }
}