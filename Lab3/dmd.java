// Base class
class Apple {
    void show() {
        System.out.println("This is Apple class show() method");
    }
}

// Derived class
class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class show() method");
    }
}

// Derived class
class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class show() method");
    }
}

// Main class
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
