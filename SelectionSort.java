import java.io.*;
                  
//(Anshika Agarwal)                   
public class SelectionSort {
                   
     public static void main(String args[]) throws IOException {
                   
         int a[]={2,3,1,7,5,4,3};
         int n=a.length;
         for(int i=0;i<n-1;i++)
         {
           int min=i;
           for(int j=i+1;j<n;j++)
           {
             if(a[j]<a[min])
             {
               min=j;
             }
           }
           int temp=a[i];
           a[i]=a[min];
           a[min]=temp;
         }
         for(int i=0;i<n;i++)
         {
           System.out.print(a[i]+" ");
         }    
     }
   }                                 
