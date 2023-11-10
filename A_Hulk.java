import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Hulk {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);

         int n=sc.nextInt();
		String s1="I hate ";
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				s1+="that I love ";
			}               
			else {
				s1+="that I hate ";
			}
		}
		System.out.print(s1+"it");
     }
   }                                 