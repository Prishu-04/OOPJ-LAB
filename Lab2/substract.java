class Subtract {
    void subtract(int a, int b) {
        System.out.println("Result (int - int) = " + (a - b));
    }
    void subtract(int a, int b, int c) {
        System.out.println("Result (int - int - int) = " + (a - b - c));
    }
    void subtract(double a, double b) {
        System.out.println("Result (double - double) = " + (a - b));
    }
    void subtract(int a, double b) {
        System.out.println("Result (int - double) = " + (a - b));
    }
}
public class substract {
    public static void main(String[] args) {
        Subtract s = new Subtract();
        s.subtract(10, 5);
        s.subtract(20, 5, 3);
        s.subtract(15.5, 4.2);
        s.subtract(10, 2.5);
    }
}