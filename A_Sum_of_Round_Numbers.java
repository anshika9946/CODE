import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Sum_of_Round_Numbers {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            int n=sc.nextInt();
            int m=n;
            int count =0;
            int i=0;
            int p=0;
            ArrayList<Integer> a=new ArrayList<>();
            while(n>0)
            {
                int d=n%10;
                n=n/10;
                if(d!=0)
                {if(i==0){p=d;}
                    else {p=d*((int)Math.pow(10, i));}
                    
                    a.add(p);
                    count++;

                }
                i++;
            }
            System.out.println(count);
            for(int s=0;s<count;s++)
            {
                System.out.print(a.get(s)+" ");
            }
            System.out.println();

                   
         }
     }
   }                                 