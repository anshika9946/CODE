import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Desorting {
                  
    static boolean isSorted(int arr[], int n) {
        for (int i = 1; i < n; i++) {
          if (arr[i] < arr[i - 1])
            return false;
        }
    
        return true;
      }
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
            int min = Integer.MAX_VALUE;
		    boolean flag = true;
		    for(int i=1; i<n; i++){
		        if(a[i] < a[i-1]){
		            flag = false;
		            System.out.println(0);
		            break;
		        }
		        min = Math.min(min, a[i] - a[i-1]);
		    }
		    if(flag){
		        System.out.println(min/2 + 1);
		    }



                   
         }
     }
   }                                 