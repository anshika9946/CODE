import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  A_Anton_and_Polyhedrons {
                   
     public static void main(String args[]) throws IOException {
                   
         Scanner sc=new Scanner(System.in);
                   
                   
         int n = sc.nextInt();
         int c=0;
         for(int i=0;i<n;i++)
         {
            String s=sc.next();
            if(s.equals("Tetrahedron")){c+=4;}
            if(s.equals("Cube")){c+=6;}
            if(s.equals("Octahedron")){c+=8;}
            if(s.equals("Dodecahedron")){c+=12;}
            if(s.equals("Icosahedron")){c+=20;}
         }
         System.out.println(c);
     }
   }                                 