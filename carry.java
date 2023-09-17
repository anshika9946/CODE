import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  carry {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   int n1=sc.nextInt();
                   int n2=sc.nextInt();
                   int count =0;

                   int rem=0;
int t1=n1;
int t2=n2;
int n=Math.max(n1,n2);
                   while(n>0)
                   {
                    int d1= t1%10;
                    int d2= t2%10;
                    t1=t1/10;
                    t2=t2/10;
                    if(d1+d2+rem > 9)
                    {
                        count++;
                        rem=1;
                    }
                        else
                        {
                        rem=0;
                    }
                    n=n/10;
                   }
                   System.out.println(count);

     }
   }                                 
