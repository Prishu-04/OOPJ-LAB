import java.util.Scanner;
public class loop{
     public static void main(String[] args){
          int[] arr=new int[]{11,12,13,14,15};
          for(int i=0;i<5;i++){
               System.out.println(i);

          }
          for(int i:arr){
               System.out.println(i);
          }
          num:
          for(int i=0;i<5;i++){
               for(int j=0;j<5;j++){
                    System.out.println("i="+i+" j="+j);
                    if(i==2 && j==2){
                         break;
                    }
               }
               System.out.println(i);
          }
     }
}