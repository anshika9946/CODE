import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Police_Recruits {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int n = sc.nextInt();
         int a[]=new int[n];
int crime=0;
int p=0;
int count=0;
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
             if(a[i]>0){p+=a[i];}
             if(a[i]==-1){if(p>0){p--;}else{count++;}}


         }
         System.out.println(count);

        }

     }                                 