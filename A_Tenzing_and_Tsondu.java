import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Tenzing_and_Tsondu{
                   
     public static void main(String args[]) throws IOException {
                   
         FastReader sc = new FastReader();
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[m];
            long sa=0,sb=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                sa+=a[i];
            }
            for(int i=0;i<m;i++)
            {
                b[i]=sc.nextInt();
                sb+=b[i];
            }
            if(sa>sb){
                System.out.println("Tsondu");
            }
            else if(sa<sb){
                System.out.println("Tenzing");
            }
            else{
                System.out.println("Draw");
            }


                   
         }
     }
                                    
                                     
                                   
                  
                   
//#########################################################################################################
static void print(int a[]){int n=a.length;for(int i=0;i<n;i++){System.out.print(a[i]);}}
    //FastReader
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        String nextLine()
        {
        String str =""; 
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken(
);
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        //Input ArrayList elements
        ArrayList<Integer> intA(int n){
            ArrayList<Integer> a=new ArrayList<>();
            for(int i =0; i < n; i ++){
                a.add(nextInt());
            }
            return a;
        }
            }
        }