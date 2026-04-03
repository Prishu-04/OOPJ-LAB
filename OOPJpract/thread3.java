class r1 implements Runnable{
     public void run(){
         for(int i=0;i<5;i++){
             System.out.println("Thread 1: "+i);
         }
     }
}
public class thread3 {
    public static void main(String[] args) {
        r1 t1 = new r1();
        Thread th1 = new Thread(t1);
        th1.start();
    }
}