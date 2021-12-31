import java.util.*;
public class Arithmetic{
     public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           int a=sc.nextInt();
           int b=sc.nextInt();
           try{
               int division=a/b;
               System.out.println(division +" ");
           }
           catch(ArithmeticException ae){
            System.out.println(ae);
           }
           finally{
               System.out.println("the finally block has executed");
           }
           sc.close();
     }
}
/*
output:
--------
2
0
java.lang.ArithmeticException: / by zero
the finally block has executed

*/