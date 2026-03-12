import java.util.Scanner;
class CounterThread extends Thread{
    int low,high;
    CounterThread(String name,int low,int high){
        super(name);
        this.low=low;
        this.high=high;
    }
    public void run(){
        try{
            System.out.println("Thread - "+getName());
            System.out.print("Counter - ");
            for(int i=low;i<=high;i++){
                System.out.print(i+" ");
                Thread.sleep(5);
            }
        }
        catch(Exception e){}
    }
}
public class ques1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Name of the thread: ");
        String name=sc.nextLine();
        System.out.print("Lower range: ");
        int low=sc.nextInt();
        System.out.print("Upper range: ");
        int high=sc.nextInt();
        CounterThread t1=new CounterThread(name,low,high);
        t1.start();
    }
}