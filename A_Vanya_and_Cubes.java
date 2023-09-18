import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Vanya_and_Cubes {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
            int n=sc.nextInt();
            int a=1,b=2,sum=0;
            int c=0;
            do
            {
                sum=sum+a;
                a=a+b;
                b++;
                c++;
            }
            while(sum<=n);

            System.out.println(c-1);
     }
   }                                 