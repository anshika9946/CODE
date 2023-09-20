import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  B_Multiply_by_2_divide_by_6 {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            long n=sc.nextLong();
            int c_six=0,c_three=0;
            while(n%6==0)
        {
            n=n/6;
            c_six++;
        }
            while(n%3==0)
        {
            n=n/3;
            c_three++;
        }
        if(n!=1){
            System.out.println("-1");
        }
        else if(c_three==0 && c_six>0){
            System.out.println(c_six);
        }
        else {
            System.out.println(c_six+(2*c_three));
        }
         }
     }
   }                                 