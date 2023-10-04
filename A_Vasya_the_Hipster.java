import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Vasya_the_Hipster {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
         int a=sc.nextInt();
         int b=sc.nextInt();
         System.out.print(Math.min(a, b)+" ");
         int c=(Math.abs(a-b))/2;
         System.out.println(c);
     }
   }                                 