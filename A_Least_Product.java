import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Least_Product {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);        
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            int n=sc.nextInt();
            long p=1;
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                p=p*a[i];
                if(p<0){p=-1;}
                if(p>0){p=1;}
            }
            if(p==0 | p==-1)
            {
                System.out.println("0");
            }
            else 
            {
                System.out.println("1");
                System.out.println("1 0");
            }

                   
         }
     }
   }                                 