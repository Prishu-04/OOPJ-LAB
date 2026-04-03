class th1 extends Thread{
     public void run(){
          try{
               for(int i=0;i<5;i++){
                    System.out.println("Thread 1: "+i);
                    Thread.sleep(2000);
               }
          } catch (InterruptedException e) {
               System.out.println("Thread interrupted");
          }
     }
}
public class thread2 {
     public static void main(String[] args) {
          th1 t1 = new th1();
          t1.start();
     }
}