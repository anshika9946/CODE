import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  C_Can_I_Square {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);         
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            long sum=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            if (Math.ceil((double)Math.sqrt(sum)) ==
            Math.floor((double)Math.sqrt(sum))) 
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
                   
         }
     }
   }                                 