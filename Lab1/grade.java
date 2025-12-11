import java.util.Scanner;
class grade{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = scanner.nextInt();
        if(num>=90 &&num<=100){
            System.out.println("Grade = O");
        }else if(num>=80 && num<90){
            System.out.println("Grade = E");
        }else if(num>=70 && num<80){
            System.out.println("Grade = A");
        }else if(num>=60 && num<70){
            System.out.println("Grade = B");
        }else if(num>=60 && num<60){
            System.out.println("Grade = C");
        }else{
            System.out.println("Grade = D");
            System.out.println("Better luck next time");
        }
        scanner.close();
    }
}