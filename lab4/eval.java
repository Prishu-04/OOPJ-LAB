import java.util.Scanner;
class eval{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=sc.nextInt(),f=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                f++;
                break;
            }
        }
        if(f==0){
            System.out.println("It is a prime number");
        }else{
            System.out.println("Its is not a prime number");
        }
        sc.close();
    }
}