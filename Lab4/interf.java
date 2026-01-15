interface Motor {
    int capacity = 5;
    void run();
    void consume();
}
class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing machine motor is running");
    }
    public void consume() {
        System.out.println("Washing machine consumes electricity");
    }
    void displayCapacity() {
        System.out.println("Motor Capacity: " + capacity);
    }
}
public class interf {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        wm.displayCapacity();
    }
}