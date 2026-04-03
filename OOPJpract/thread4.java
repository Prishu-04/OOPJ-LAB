class r4 implements Runnable{
     public void run(){
         try{
               for(int i=0;i<5;i++){
                    System.out.println("Thread 4: "+i);
                    Thread.sleep(1000);
               }
         }catch(InterruptedException e){
               System.out.println("Thread 4 interrupted");
         }
     }
}
public class thread4 {
    public static void main(String[] args) {
        r4 t4 = new r4();
        Thread th4 = new Thread(t4);
        th4.start();
    }
}