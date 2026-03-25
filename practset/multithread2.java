class ArrivalAnnouncement implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Arrival Announcement " + i + ": Train " + (100 + i) + " is arriving at Platform " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Arrival thread interrupted");
            }
        }
    }
}
class DepartureAnnouncement implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Departure Announcement " + i + ": Train " + (200 + i) + " is departing from Platform " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Departure thread interrupted");
            }
        }
    }
}
public class multithread2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ArrivalAnnouncement());
        Thread t2 = new Thread(new DepartureAnnouncement());

        t1.start();
        t2.start();
    }
}
