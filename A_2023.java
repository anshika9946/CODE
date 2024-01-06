import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_2023 {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);          
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            int n=sc.nextInt();
            int b[]=new int[n];
            int m=sc.nextInt();
            long p=1;
            for(int i=0;i<n;i++)
            {
                b[i]=sc.nextInt();
                p=p*b[i];
            }
            if(2023%p==0)
            {
                System.out.println("YES");
                System.out.print((2023/p)+" ");
                for(int i=1;i<m;i++)
                {
                    System.out.print("1 ");
                }
                System.out.println();
            }
            else{
                System.out.println("NO");
            }
                   
         }
     }
   }                                 