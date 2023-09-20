import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Keyboard {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
            char c=sc.next().charAt(0);
            String s=sc.next();
            String s1="qwertyuiop";
            String s2="asdfghjkl;";
            String s3="zxcvbnm,./";
            String ans="";
            if(c=='R')
            {
                for(int i=0;i<s.length();i++)
                {
                    if(s1.indexOf(s.charAt(i))!=-1)
                    {
                        ans+=s1.charAt(s1.indexOf(s.charAt(i))-1);
                    }
                    else if(s2.indexOf(s.charAt(i))!=-1)
                    {
                        ans+=s2.charAt(s2.indexOf(s.charAt(i))-1);
                    }
                    else if(s3.indexOf(s.charAt(i))!=-1)
                    {
                        ans+=s3.charAt(s3.indexOf(s.charAt(i))-1);
                    }
                }
            }
            else
            {
                for(int i=0;i<s.length();i++)
                {
                    if(s1.indexOf(s.charAt(i))!=-1)
                    {
                        ans+=s1.charAt(s1.indexOf(s.charAt(i))+1);
                    }
                    else if(s2.indexOf(s.charAt(i))!=-1)
                    {
                        ans+=s2.charAt(s2.indexOf(s.charAt(i))+1);
                    }
                    else if(s3.indexOf(s.charAt(i))!=-1)
                    {
                        ans+=s3.charAt(s3.indexOf(s.charAt(i))+1);
                    }
                }
            }
            System.out.println(ans);       
         }
     }                                