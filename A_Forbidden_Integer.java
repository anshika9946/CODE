import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Forbidden_Integer {
                   
     public static void main(String args[]) throws IOException {
                   
         FastReader sc = new FastReader();
                   
                   
         int t = sc.nextInt();
         while (t-- > 0) 
        {
            int a=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            if(a==k )
            {
                if(x!=a)
                {System.out.println("YES");
                System.out.println("1");
                System.out.println(a);}
                else{
                    System.out.println("YES");
                    System.out.println(a);
                    for(int i=0;i<a;i++)
                    {System.out.print("1 ");}
                    System.out.println();
                }
            }
            else{
                if(x!=1)
                { System.out.println("YES");
                    System.out.println(a);
                    for(int i=0;i<a;i++)
                    {System.out.print("1 ");}
                    System.out.println();

                }
                else{
                    if(k==x)
                    {
                        System.out.println("NO");
                    }
                    else if(a%2==0)
                    {int c=a/2;
                         System.out.println("YES");
                    System.out.println(c);
                    for(int i=0;i<c;i++)
                    {System.out.print("2 ");}
                    System.out.println();
                    }
                    else{
                        a=a-2;
                        
                        if(a<=k)
                        {System.out.println("YES");
                        System.out.println("2");
                        System.out.println("2 a");
                        }
else{
    System.out.println("NO");
}
                    }
                }
            }

                   
         }
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