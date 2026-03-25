class ArrivalTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Arrival " + i + ": Flight AI" + (300 + i) + " has landed.");
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                System.out.println("Arrival task interrupted");
            }
        }
    }
}
class DepartureTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Departure " + i + ": Flight IND" + (400 + i) + " is ready for departure.");
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                System.out.println("Departure task interrupted");
            }
        }
    }
}
class BoardingGateTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Boarding Announcement " + i + ": Passengers for Flight G" + (500 + i) + " proceed to Gate " + i + ".");
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                System.out.println("Boarding task interrupted");
            }
        }
    }
}
public class multithread5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ArrivalTask());
        Thread t2 = new Thread(new DepartureTask());
        Thread t3 = new Thread(new BoardingGateTask());
        t1.start();
        t2.start();
        t3.start();
    }
}
