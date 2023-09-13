import java.io.*;
                  
//(Anshika Agarwal)                   
public class  MergeSort {
                   
     public static void main(String args[]) throws IOException {
                   
        int a[]={2,3,1,7,5,4,3};
        int n=a.length;
        mergeSort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
     }\
        static void mergeSort(int a[],int l,int h)
        {
        if(l<h)
        {
            int mid=(l+h)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,h);
            merge(a,l,mid,h);
        }
        }
        static void merge(int a[],int l,int mid,int h)
        {
            int i=l;
            int j=mid+1;
            int k=l;
            int b[]=new int[h+1];
            while(i<=mid && j<=h)
            {
                if(a[i]<a[j])
                {
                    b[k]=a[i];
                    i++;
                    k++;
                }
                else
                {
                    b[k]=a[j];
                    j++;
                    k++;
                }
            }
            while(i<=mid)
            {
                b[k]=a[i];
                i++;
                k++;
            }
            while(j<=h)
            {
                b[k]=a[j];
                j++;
                k++;
            }
            for(int m=l;m<=h;m++)
            {
                a[m]=b[m];
            }
        }
   }                                 