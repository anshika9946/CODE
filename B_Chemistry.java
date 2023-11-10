import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  B_Chemistry {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            int n = sc.nextInt();
			int k = sc.nextInt();
			String s = sc.next();
			int [] count =  new int [26];
			int odd=0;
			for(int i =0;i<n;i++) {
				count[s.charAt(i)-'a']++;
			}
			for(int i =0;i<26;i++) {
				if(count[i]%2==1) {
					odd++;
				}
			}
			odd=odd-1;
			if(odd<=k) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}

                   
         }
     }
   }                                 