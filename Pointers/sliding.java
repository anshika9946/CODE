package Pointers;
import java.io.IOException;
import java.util.*;
class sliding
{
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int sum=0;
        int l=0,r=0;
        int maxL=0;
        while(r<=n-1)
        {
            sum=sum+a[r];
            
            if(sum>k)
            {
                while(sum>k)
                { 
                sum=sum-a[l];
                l++;
            }
        }
            maxL=Math.max(r-l+1,maxL);
            r++;
            
        }
        System.out.println(maxL);
    }
}


// expand the window r++ or shrink the window l++
//input: 
// 5
// 2 5 1 7 10
// 14
// Output:
// 3