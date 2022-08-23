import java.util.*;
public class Optimal_Reduction{
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
 
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int i=0;
            while(i+1<n&&arr[i+1]>=arr[i])
 
{i++;}
 
            while (i+1<n&&arr[i+1]<=arr[i])
{i++;}
            if(i+1==n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}