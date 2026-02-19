import java.util.Scanner;
class HrsException extends Exception{
    public HrsException(String m1){
        super(m1);
    }
}
class MinsException extends Exception{
    public MinsException(String m2){
        super(m2);
    }
}
class SecException extends Exception{
    public SecException(String m3){
        super(m3);
    }
}
class Time{
    int hours, minutes, seconds;
    public void getTime(int h, int m, int s) throws HrsException, MinsException, SecException {
        if (h < 0 || h > 24) {
            throw new HrsException("hour is not greater than 24");
        }
        if (m < 0 || m > 60) {
            throw new MinsException("minute is not greater than 60");
        }
        if (s < 0 || s > 60) {
            throw new SecException("second is not greater than 60");
        }
        hours = h;
        minutes = m;
        seconds = s;
        System.out.println("Correct Time -> " + hours + ":" + minutes + ":" + seconds);
    }
}
public class ques4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time t = new Time();
        try {
            System.out.print("Enter hours: ");
            int h = sc.nextInt();
            System.out.print("Enter minutes: ");
            int m = sc.nextInt();
            System.out.print("Enter seconds: ");
            int s = sc.nextInt();
            t.getTime(h, m, s);
        }
        catch (HrsException e) {
            System.out.println("Exception occurred: " + e);
        }
        catch (MinsException e) {
            System.out.println("Exception occurred: " + e);
        }
        catch (SecException e) {
            System.out.println("Exception occurred: " + e);
        }
        sc.close();
    }
}
