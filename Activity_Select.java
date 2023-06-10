import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  Activity_Select {
                   
     public static void main(String args[]) throws IOException {
                   
         int start[]={1,3,0,5,8,5};
         int end[]={2,4,6,7,9,9};

         //sorting
         int activities[][] = new int[start.length][3];
         for(int i=0;i<start.length;i++)
         {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
         }
//sorting 2d array
Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));


         int maxAct=1;
         ArrayList<Integer> ans=new ArrayList<>();

         ans.add(activities[0][0]);
         int lastEnd = activities[0][2];
         for(int i=0;i<end.length;i++)
         {
            if(activities[i][1]>=lastEnd)
            {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];

            }
         }
         System.out.println("max activities = " +maxAct);
         for(int i=0;i<ans.size();i++)
         {
            System.out.print("A"+ans.get(i)+" ");
         }
         System.out.println();

                   

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