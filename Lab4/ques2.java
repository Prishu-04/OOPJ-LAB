//-Define an interface Motor with a data member –capacity and two methods
//such as run() and consume(). Define a Java class ‘Washing machine’ which implements this
//interface and write the code to check the value of the interface data member thru an object of the
//class.
import java.util.*;
interface Motor {
    int capacity = 10; // capacity in kg

    void run();

    void consume();
}
class WashingMachine implements Motor{
     public void run(){
         System.out.println("Washing Machine is running");
     }
     public void consume(){
         System.out.println("Washing Machine is consuming power");
     }
}
public class ques2{
     public static void main(String args[]){
          WashingMachine wash=new WashingMachine();
          wash.run();
          wash.consume();  
          System.out.println("Capacity of the motor is: " + Motor.capacity + " kg");   
     }
}