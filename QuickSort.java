import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  QuickSort {
                   
     public static void main(String args[]) throws IOException {
        int a[]={10, 80, 30, 90, 40, 50, 70};
        int low=a[1];
        int high=a[a.length-1];
        quicksort(a,low,high);
       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i]+" ");
       }
      
     }
      
        static void quicksort(int a[],int low,int high)
        {
            if(low<high)
            {
                int pi=partition(a,low,high);
                quicksort(a,low,pi-1);
                quicksort(a,pi+1,high);
            }
        }

        static int partition(int a[],int low,int high)
        {
            int pivot=a[high];
            int i=low-1;
            for(int j=low;j<high;j++)
            {
                if(a[j]<pivot)
                {
                    i++;
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            int temp=a[i+1];
            a[i+1]=a[high];
            a[high]=temp;
            return i+1;
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