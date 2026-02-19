import java.util.Scanner;
class A{
    static int x;
    int y;
    A(int x,int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        x++;
        y++;
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }
}
class B extends A{
    int z;
    B(int x,int y,int c) {
        super(x,y);
        this.z = c;
    }
    void display(){
        super.display();
    }
}
public class test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        A a=new A(x,y);
        int z=sc.nextInt();
        B b1=new B(x,y,z);
        B b2=new B(2,3,4);
        b1.display();
        b2.display();
    }
}