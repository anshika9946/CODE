import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_To_My_Critics {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            
            int f=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a+b >=10)f=1;
            int c=sc.nextInt();
            if(a+c>=10 | b+c>=10)f=1;
            if(f==1)System.out.println("YES");
            else{System.out.println("NO");}

                   
         }
     }
   }                                 