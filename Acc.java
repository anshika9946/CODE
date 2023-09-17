import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  Acc {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
    String s=sc.next();
    int n=s.length();
    
    String word="";
    int f=0;
    for(int i=0;i<n;i++)
    {String str="";
        char c=s.charAt(i);
        if(Character.isUpperCase(c)==true || i==n-1)
        {   if(i==n-1){word=s.substring(f, i+1);}
        else
            word=s.substring(f, i);
            f=i;
            int l=word.length();
            for(int j=0;j<l;j++)
            {
                char ch=word.charAt(j);
                if(Character.isUpperCase(ch)==true)
                {
                    str=str+Character.toLowerCase(ch);
                }
                else
                {
                    str=str+Character.toUpperCase(ch);
                }
            }
             System.out.println(str);
        }
       
    }


     }
   }                                 
