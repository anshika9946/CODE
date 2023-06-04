import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Cinema_Line {
                   
     public static void main(String args[]) throws IOException {
                   
         FastReader sc = new FastReader();
                   
         long c1=0,c2=0,c3=0;    
         long n = sc.nextLong();
         while(n-->0) {
			int a=sc.nextInt();
			if(a==25) {
				c2++;
			}
			else if(a==50) {
				if(c2<1) {
					c1=1;
					break;
				}
				else
				{
					c2-=1;
					c3+=1;
				}
			}
			else if(a==100) {
				if(c2>=1 && c3>=1) {
					c2-=1;
					c3-=1;
				}
				else if(c2>=3) {
					c2-=3;
				}
				else
				{
					c1=1;
					break;
				}
			}
		}
		if(c1==0) System.out.println("YES");
		else System.out.println("NO");
		
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