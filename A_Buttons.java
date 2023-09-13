import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Buttons {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(c%2==1)a=a+1;
            if(a<=b)System.out.println("Second");
            else System.out.println("First");


                   
         }
     }
   }                                 