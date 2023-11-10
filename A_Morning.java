import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Morning {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            String s = sc.next();
            int val1, val2, val3, val4;
            val1 = s.charAt(0) - '0';
            val2 = s.charAt(1) - '0';
            val3 = s.charAt(2) - '0';
            val4 = s.charAt(3) - '0';
            if(val1==0) val1 = 10;
            if(val2==0) val2 = 10;
            if(val3==0) val3 = 10;
            if(val4==0) val4 = 10;
            int ans = 4;
            ans += Math.abs(val1 - val2) + Math.abs(val2 - val3) + Math.abs(val3 - val4) + Math.abs(val1 - 1);
            System.out.println(ans);      
         }
     }
   }                                 