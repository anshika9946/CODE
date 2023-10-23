import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Collecting_Coins {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int n=sc.nextInt();
            int max=Math.max(a,Math.max(b,c));
			n=n-(max*3-(a+b+c));
			if(n%3==0 && n>=0)
			{
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}

                   
         }
     }
   }                                 