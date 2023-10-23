import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Magical_Sticks {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
int n=sc.nextInt();
int sum=0;
if(n%2==0){sum=n/2 ;}
else{
sum=n/2 +1;
}
System.out.println(sum);
                   
         }
     }
   }                                 