import java.util.Scanner;
class student{
    int roll;
    String name;
    void getinput(){
        System.out.println("HI");
    }
}
class staff extends student{
    void getinput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your roll:");
        roll=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name:");
        name=sc.nextLine();
    }
}
public class eval2{
    public static void main(String[] args){
        student st=new staff();
        st.getinput();
    }
}