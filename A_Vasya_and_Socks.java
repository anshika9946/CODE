import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Vasya_and_Socks {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   int n=sc.nextInt();
                   int m=sc.nextInt();
                   int c=m;
                   int count=0;
                   while(n>0)
                   {
                    count++;
                    n--;
                    c--;
                    if(c==0)
                    {
                        n++;
                        c=m;
                    }

                   }
                   System.out.println(count);

     }
   }                                 