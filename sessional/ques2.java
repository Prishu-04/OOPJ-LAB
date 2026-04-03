import java.util.*;
class Product{
     int product_id;
     String name;
     double price;
     Product(int pid, String name, double price){
          this.product_id=pid;
          this.name=name;
          this.price=price;
     }
     void discount(int dis, int amt){
          price=price-(dis*(10/100));
          price=price+amt;
          System.out.println("Final Price: "+price);
     }
}
public class ques2{
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.print("Product_id: ");
          int pid=sc.nextInt();
          System.out.print("Name: ");
          sc.nextLine();
          String name=sc.nextLine();
          System.out.print("Price: ");
          double price=sc.nextDouble();
          Product p=new Product(pid,name,price);
          System.out.print("Discount: ");
          int dis=sc.nextInt();
          System.out.print("Increase Amount: ");
          int amt=sc.nextInt();
          p.discount(dis,amt);
     }
}