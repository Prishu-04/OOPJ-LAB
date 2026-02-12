class student{
     int id;
     String name;

     student(){
          id=0;
          name="No name";
     }

     student(int i, String n){
         id = i;
         name = n;
     }
     void display(){
         System.out.println(id + " " + name);
     }
}
public class defcons {
     public static void main(String args[]){
         student s1 = new student();
         student s2 = new student(101, "Avipsha");

         s1.display();
         s2.display();
     }
}