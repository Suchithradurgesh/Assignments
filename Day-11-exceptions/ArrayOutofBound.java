//EXAMPLE  PROGRAM ON ARRAYINDEXOUTOFBOUND EXCEPTION

import java.util.*;
public class ArrayOutofBound {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first[]=new int[n];
        for(int i=0;i<n;i++){
            first[i]=sc.nextInt();
        }
        try{
        for(int i=0;i<=n;i++){
            System.out.print(first[i]);
        }
    }
    catch(ArrayIndexOutOfBoundsException aie){
        System.out.println(aie);
    }
    finally{
        System.out.println("finally block has been executed");
    }
        sc.close();
    }    
}
/*
output:
-------

3
1 2 3
123java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
finally block has been executed

*/