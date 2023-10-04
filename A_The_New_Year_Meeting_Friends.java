import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_The_New_Year_Meeting_Friends {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
int x1=sc.nextInt();
int x2=sc.nextInt();
int min=(int)Math.min(x1, x2);
int max=(int)Math.max(x1, x2);
int x3=sc.nextInt();
int min1=(int)Math.min(min, x3);
int max1=(int)Math.max(max, x3);
int sum=(x1+x2+x3 )- (min1+max1);
int dis=(sum-min1)+(max1-sum);
System.out.println(dis);
     }
   }                                 