import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Minutes_Before_the_New_Year {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            int h=sc.nextInt();
            int m=sc.nextInt();
            int count=0;
            count = (24-h-1)*60 + (60-m);
            System.out.println(count);

                   
         }
     }
   }                                 