import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Brain_s_Photos {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
         int n=sc.nextInt();;
         int m=sc.nextInt();
         int c=0;
         for(int i=0;i<n;i++)
         {
                for(int j=0;j<m;j++)
                {
                    char ch=sc.next().charAt(0);
                    if(ch=='C' || ch=='M' || ch=='Y')
                    {
                        c++;
                    }
                }
         }
         if(c>0) System.out.println("#Color");
         else System.out.println("#Black&White");
     }
   }                                 