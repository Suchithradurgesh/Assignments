import java.io.*;
import java.util.*;
public class String1{
    public static void main(String args[]){
        int length;
        Scanner sc=new Scanner(System.in);
        String A =sc.next();
        String B =sc.next();
        length=A.length()+B.length();
        System.out.println(length);
        int c=A.compareTo(B);
        if(c>0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        System.out.print(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase()+" ");
         System.out.print(B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase());

        
      
}

}