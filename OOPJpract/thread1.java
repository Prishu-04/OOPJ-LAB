import java.util.*;
class th1 extends Thread{
     public void run(){
          System.out.println("Hello, Avipsha");
     }
}
public class thread1{
     public static void main(String[] args){
          th1 t1=new th1();
          t1.start();
     }
}