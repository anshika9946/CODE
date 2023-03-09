import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Noldbach_problem {
    public static boolean isprime(int n) {
        if(n==2)
          return true;
        for(int i=3;i<n;i++)
          if(n%i==0)
          return false;
        return true;
      }
     public static void main(String args[]) throws IOException {
                   
         FastReader sc = new FastReader();
                   
                   
         int n=sc.nextInt();
         int k=sc.nextInt();
         int z=0,t=0;
         int[] p = new int[n];
         for(int i=2;i<=n;i++)
           if(isprime(i)) 
           {
           p[z++]=i;
         }
         for(int i=0;i<z;i++) 
         {
           if(isprime(p[i]+p[i+1]+1)&&p[i]+p[i+1]+1<=n)
             t++;
         }
         System.out.println(t>=k?"YES":"NO");
       
       
         
     }
                                                    
                   
//#########################################################################################################
    static int Intmax(){return Integer.MAX_VALUE;} 
    static int Intmint(){ return Integer.MIN_VALUE;}
    static char get(String s, int i) {char c=s.charAt(i);return c;}
    static int max(int a, int b){return Math.max(a, b);}
    static int min(int a, int b){return Math.min(a, b);}
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
        String str = ""; 
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
        //Input Array elements
        int[] intArray(int n){
            int[] arr = new int[n];
            for(int i =0; i < n; i ++){
                arr[i] = nextInt();
            }
            return arr;
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