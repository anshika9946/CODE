import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Tales_of_a_Sort {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();

            }
            int max=a[0];
            int flag=0;
            for(int i=1;i<n;i++)
            {
                if(a[i]<a[i-1])
                {
                    
                    flag=1;
                    if(a[i-1]>max)
                    {max=a[i-1];}

                }
                
            }
            if(flag==0)
            {
                System.out.println("0");
            }
            else
            System.out.println(max);


                   
         }
     }
   }                                 