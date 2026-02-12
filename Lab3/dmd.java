class Apple {
    void show() {
        System.out.println("This is Apple class show() method");
    }
}
class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class show() method");
    }
}
class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class show() method");
    }
}
public class dmd {
    public static void main(String[] args) {

        Apple ref;   // Base class reference

        ref = new Apple();
        ref.show();      // Calls Apple show()

        ref = new Banana();
        ref.show();      // Calls Banana show()

        ref = new Cherry();
        ref.show();      // Calls Cherry show()
    }
}
