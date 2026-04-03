import java.util.*;
class th1 extends Thread{
     public void run(){
          for(int i=0;i<5;i++){
               System.out.println("Thread 1: "+i);
               System.out.println("Hello, Avipsha");
               try{
                    Thread.sleep(2000);
               }catch(InterruptedException e){
                    System.out.println("Thread 1 interrupted");
               }
          }
     }
}
class th2 extends Thread{
     public void run(){
          for(int i=0;i<5;i++){
               System.out.println("Thread 2: "+i);
               System.out.println("Hello, Pratyaksh");
               try{
                    Thread.sleep(1000);
               }catch(InterruptedException e){
                    System.out.println("Thread 2 interrupted");
               }
          }
     }
}
public class multith1{
     public static void main(String[] args){
          th1 t1=new th1();
          th2 t2=new th2();
          t1.start();
          t2.start();
     }
}