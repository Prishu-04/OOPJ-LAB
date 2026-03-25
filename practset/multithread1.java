class OrderProcess extends Thread {
    public void run() {
        String[] steps = {"Order accepted", "Food preparing", "Food packed"};
        for (String step : steps) {
            System.out.println(step);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Order thread interrupted");
            }
        }
    }
}
class DeliveryProcess extends Thread {
    public void run() {
        String[] steps = {"Delivery started", "Reached customer location", "Delivered"};
        for (String step : steps) {
            System.out.println(step);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Delivery thread interrupted");
            }
        }
    }
}
public class multithread1 {
    public static void main(String[] args) {
        OrderProcess order = new OrderProcess();
        DeliveryProcess delivery = new DeliveryProcess()
        order.start();
        try {
            order.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        delivery.start();
    }
}
