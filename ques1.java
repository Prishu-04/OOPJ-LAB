class RestaurantThread extends Thread{
     public void run(){
          System.out.println("Order Accepted");
          Thread.sleep(50); 
          System.out.println("Food Preparing");
          System.out.println("Food Packed");
     }
}
class DeliveryThread extends Thread{
     public void run(){
               System.out.println("Delivery Started");
               System.out.println("Reached Customer Location");
               System.out.println("Delivered");
     }
}
public class FoodDelivery{
     public static void main(String[] args){
          RestaurantThread t1 = new RestaurantThread();
          DeliveryThread t2 = new DeliveryThread();
          t1.start();
     }
}