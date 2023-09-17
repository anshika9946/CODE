import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  ThreeFive {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                  
         int n=sc.nextInt();
         int m=sc.nextInt();

         int c=n/15+1;
         int sum=0;
         int pro=15*c;
         while(pro<=m)
         {
            if(pro<=m && pro>=n)
            {
                sum+=pro;
                pro=pro+15;
            }
         }
         System.out.println(sum);
                   

     }
   }                                 
