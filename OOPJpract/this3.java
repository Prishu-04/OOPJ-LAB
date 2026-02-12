class A{
    A(){
        System.out.println("hello a");
    }
    A(int x){
        this();   // calls default constructor
        System.out.println(x);
    }
}
class this3{
    public static void main(String args[]){
        A a = new A(10);
    }
}
