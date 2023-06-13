package Greedy;
import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  Frac_KS {
                   
     public static void main(String args[]) throws IOException {
                   
int val[]={60,100,120};
int weight[]={10, 20, 30};
int w=50;

double ratio[][]=new double[val.length][2];

for(int i=0;i<val.length;i++)
{
    ratio[i][0] = i;
    ratio[i][1] = val[i]/(double)weight[i];
}

Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));


int capacity = w;
int finalVal = 0;
for(int i=ratio.length-1; i>=0;i--)
{
    int idx = (int)ratio[i][0];
    if(capacity>= weight[idx]){
        finalVal+=val[idx];
        capacity-=weight[idx];
    }
    else{
        finalVal+=(ratio[i][1] * capacity);
        capacity=0;
        break;
    }
}
System.out.println("final value = "+finalVal);
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