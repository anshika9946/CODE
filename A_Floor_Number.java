import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Floor_Number {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int f=0;
            if(a<=2)f=1;
            else{
                f=(int)Math.ceil((double)(a-2)/(double)b) +1;
            }
            System.out.println(f);

                   
         }
     }
   }                                 