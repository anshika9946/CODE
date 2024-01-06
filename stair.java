import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  stair {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         int currentF=sc.nextInt();
         int n=sc.nextInt();
         ArrayList<Integer> a=new ArrayList<>();
         for(int i=0;i<n;i++)
         {
            int arr=sc.nextInt();
            a.add(arr);
         }
         Collections.sort(a);
         if(!s.equals("UP") && !s.equals("DN"))
         {
            System.out.println("Invalid input");
         }
         else{
            if(s.equals("UP"))
            {
                
            }
         }

     }
   }                                 
