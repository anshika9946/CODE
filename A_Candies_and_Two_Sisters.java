import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Candies_and_Two_Sisters {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            long n=sc.nextLong();
            if(n%2==0)
            {
                System.out.println(n/2-1);
            }
            else
            {
                System.out.println(n/2);
            }

            

                   
         }
     }
   }                                 