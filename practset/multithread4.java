class RegistrationThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Patient registration completed for patient " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Registration thread interrupted");
            }
        }
    }
}
class ConsultationThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Doctor consultation completed for patient " + i);
            try {
                Thread.sleep(450);
            } catch (InterruptedException e) {
                System.out.println("Consultation thread interrupted");
            }
        }
    }
}
class LaboratoryThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Laboratory test update generated for patient " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Laboratory thread interrupted");
            }
        }
    }
}
public class multithread4 {
    public static void main(String[] args) {
        RegistrationThread t1 = new RegistrationThread();
        ConsultationThread t2 = new ConsultationThread();
        LaboratoryThread t3 = new LaboratoryThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
