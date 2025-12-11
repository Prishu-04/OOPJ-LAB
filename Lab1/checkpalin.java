import java .util.Scanner;
public class checkpalin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rev=0;
        int num=n;
        while(num!=0){
            int ld=num%10;
            rev=rev*10+num%10;
            num=num/10;
        }
        if(rev==n){
            System.out.println("Yes, It is palindrome");
        }else{
            System.out.println("No, It is not palindrome");
        }
    }

}