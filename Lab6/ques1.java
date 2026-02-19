import java.util.Scanner;

public class ques1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        try{
            for(int i=0;i<n+1;i++){
                arr[i]=sc.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: " + e);
        }
        sc.close();
    }
}