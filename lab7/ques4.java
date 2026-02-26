import java.io.*;
import java.util.*;
public class ques4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename=sc.nextLine();
        int charCount=0,wordCount=0,lineCount=0;
        try{
            BufferedReader br=new BufferedReader(new FileReader(filename));
            String line;
            while((line=br.readLine())!=null){
                lineCount++;
                charCount+=line.length();
                if(!line.trim().isEmpty()){
                    String words[]=line.trim().split("\\s+");
                    wordCount+=words.length;
                }
            }
            br.close();
            System.out.println("No. of characters - "+charCount);
            System.out.println("No. of lines - "+lineCount);
            System.out.println("No. of words - "+wordCount);
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        sc.close();
    }
}