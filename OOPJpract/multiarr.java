import java.util.*;
public class multiarr{
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int arr[][]=new int[3][3];
          int[][] brr=new int[3][3];
          int[][] crr={{1,2,3}
                    ,{4,5,6} 
                    ,{7,8,9}
                    };
          for(int i=0;i<3;i++){
               for(int j=0;j<3;j++){
                    System.out.print(""+crr[i][j]);
               }
               System.out.println();
          }
     }
}