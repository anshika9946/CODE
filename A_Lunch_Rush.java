import java.util.*;
class A_Lunch_Rush
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int fun=Integer.MIN_VALUE;
        int f=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            if(b[i]>m) {f=a[i]-(b[i]-m);}
            else{f=a[i];}
            if(f>fun)fun=f;
        }
        System.out.println(fun);

    }
}