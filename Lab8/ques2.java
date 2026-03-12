class Display{
    synchronized void show(String name){
        String msg[]={"I","Love","java","Very","Much"};
        for(int i=0;i<msg.length;i++){
            System.out.println(name+": "+msg[i]);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){}
        }
    }
}
class Thread1 extends Thread{
    Display d;
    Thread1(Display d){
        this.d=d;
    }
    public void run(){
        d.show("Thread 1");
    }
}
class Thread2 extends Thread{
    Display d;
    Thread2(Display d){
        this.d=d;
    }
    public void run(){
        d.show("Thread 2");
    }
}
public class ques2{
    public static void main(String args[]){
        Display obj=new Display();
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        t1.start();
        t2.start();
    }
}