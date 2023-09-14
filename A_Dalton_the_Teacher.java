import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Dalton_the_Teacher {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            int n=sc.nextInt();
            int a[]=new int[n]; 
            int num=1;
            int count=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]==num)
                {
                 count++;   
                }
                num++;
            }
            System.out.println((int)Math.ceil(count/2.0));


                   
         }
     }
   }                                 