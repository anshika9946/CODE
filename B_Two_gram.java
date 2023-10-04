import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  B_Two_gram {
                   
     public static void main(String args[]) throws IOException {
                   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<n-1;i++)
        {
        String s1=s.charAt(i)+""+s.charAt(i+1)+"";
        if(hm.containsKey(s1))
        {
        hm.put(s1,hm.get(s1)+1);
        }
        else
        {
        hm.put(s1,1);
        }
        }
        String res1="";
        int res=0;
        for(Map.Entry<String,Integer> e:hm.entrySet())
        {
        int val=e.getValue();
        if(val>res){
        res=val;
        res1=e.getKey();
        }
        }
        System.out.println(res1);
     }
   }                                 