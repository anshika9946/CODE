import java.io.*;
                  
//(Anshika Agarwal)                   
public class  QuickSort {
                   
     public static void main(String args[]) throws IOException {
                             
         int a[]={2,3,1,7,5,4,3};
         int n=a.length;
            quickSort(a,0,n-1);
            for(int i=0;i<n;i++)
            {
              System.out.print(a[i]+" ");
            }
     }
        static void quickSort(int a[],int l,int h)
        {
        if(l<h)
        {
            int p=partition(a,l,h);
            quickSort(a,l,p-1);
            quickSort(a,p+1,h);
        }
        }
        static int partition(int a[],int l,int h)
        {
            int pivot=a[l];
            int i=l;
            int j=h;
            while(i<j)
            {
                while(a[i]<=pivot)
                {
                    i++;
                }
                while(a[j]>pivot)
                {
                    j--;
                }
                if(i<j)
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            int temp=a[l];
            a[l]=a[j];
            a[j]=temp;
            return j;
        }
   }                                 