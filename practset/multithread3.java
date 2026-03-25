class ExamTask implements Runnable {
    public void run() {
        Thread current = Thread.currentThread();
        if (current.getName().equals("TimerThread")) {
            for (int i = 1; i <= 20; i++) {
                System.out.println("Timer: " + i + " seconds");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.out.println("Timer interrupted");
                }
            }
        } else if (current.getName().equals("AutoSaveThread")) {
            for (int i = 1; i <= 4; i++) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Auto-save interrupted");
                }
                System.out.println("Answer auto-saved");
            }
        }
    }
}
public class multithread3 {
    public static void main(String[] args) {
        ExamTask sharedTask = new ExamTask();
        Thread timerThread = new Thread(sharedTask, "TimerThread");
        Thread autoSaveThread = new Thread(sharedTask, "AutoSaveThread");
        timerThread.start();
        autoSaveThread.start();
    }
}
