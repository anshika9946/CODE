import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  fib {

    static int fibbo(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int N = sc.nextInt();
         int a=0;
         int n=(N*(N+1))/2 -1;
         for(int i=0;i<N;i++)
         {
            for(int j=0;j<=i;j++)
{
     a=fibbo(n);
    System.out.print(a+"  ");
    n--;
}
System.out.println();


         }
         
     }
   }                                 
