import java.io.*;
                  
//(Anshika Agarwal)                   
public class  BubbleSort {
                   
     public static void main(String args[]) throws IOException {
               
        int a[]={2,3,1,7,5,4,3};
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<n-1-i;j++)
          {
            if(a[j]>a[j+1])
            {
              int temp=a[j];
              a[j]=a[j+1];
              a[j+1]=temp;
            }
          }
        }
        for(int i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
     }
   }                                                         