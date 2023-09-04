import java.io.*;
                  
//(Anshika Agarwal)                   
public class  InsertionSort {
                   
     public static void main(String args[]) throws IOException {
              
        int a[]={2,3,1,7,5,4,3};
        int n=a.length;
        for(int i=1;i<n;i++)
        {
          int temp=a[i];
          int j=i-1;
          while(j>=0 && a[j]>temp)
          {
            a[j+1]=a[j];
            j--;
          }
          a[j+1]=temp;
        }
        for(int i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }

     }
   }                                 
