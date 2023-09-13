import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_United_We_Stand {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();

            }
            ArrayList<Integer> b=new ArrayList<>();
            ArrayList<Integer> c=new ArrayList<>();
            Arrays.sort(a);
            b.add(a[0]);
            for(int i=1;i<n;i++)
            {
                if(a[i]==a[0]){b.add(a[i]);}
                else{c.add(a[i]);}
            }
            if(c.size()==0)
            {
                System.out.println("-1");
            }
            else{
                System.out.println(b.size()+" "+c.size());
                for(int i=0;i<b.size();i++)
                {
                    System.out.print(b.get(i)+" ");
                }
                System.out.println();
                for(int i=0;i<c.size();i++)
                {
                    System.out.print(c.get(i)+" ");
                }
                System.out.println();
            }
            



                   
         }
     }
   }                                 