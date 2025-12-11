import java.util.Scanner;
class displaylfn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your First Name:");
        String fname=sc.nextLine();
        System.out.println("Enter your Last Name:");
        String lname=sc.nextLine();
        System.out.println(lname +" "+ fname);
        sc.close();
    }
}