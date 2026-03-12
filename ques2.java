class ArrivalAnnouncement implements Runnable{
    public void run(){
          for(int i=1;i<=5;i++){
               System.out.println("Train Arrival Announcement " + i);
          }
    }
}
class DepartureAnnouncement implements Runnable{
     public void run(){
          for(int i=1;i<=5;i++){
               System.out.println("Train Departure Announcement " + i);            
          }
     }
}
public class RailwayStation{
    public static void main(String[] args){
        ArrivalAnnouncement a = new ArrivalAnnouncement();
        DepartureAnnouncement d = new DepartureAnnouncement();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();
    }
}