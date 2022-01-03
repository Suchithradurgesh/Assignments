//PROGRAM ON NULLPOINTER EXEPTION

import java.util.*;
public class NullPointer {
    public static void main(String args[]){
          
        String str=null;
          try{
            if (str.equals("gfg"))
                System.out.print("Same");
            else 
                System.out.print("Not Same");
        
          }
          catch(Exception e){
              System.out.println(e);
          }
          finally{
              System.out.println("finally block has executed");
          }
        
    }
}
/*
output:
--------

java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "<local1>" is null
finally block has executed

*/
