import java.util.*;
import java.io.*;
class Datatypes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            try{
                long x=sc.nextLong();
                System.out.println(x+"can be fitted in:");
                if(x>=-128 && x<=127)
                System.out.println("* byte");
                if(x>=-2147483648 && x<=2147483647)
                System.out.println("* int");
                if(x>=-32768 && x<=32767)
                System.out.println("* short");
                if(x>=-9223372036854775808L && x<=9223372036854775807L)
                System.out.println("* long");
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+"cant be fitted anywhere");

            }
        }

    }
    
    }
/*OUTPUT:
3
-150
-150can be fitted in:
* int
* short
* long
150000
150000can be fitted in:
* int
* long
150000000000000000000000000000000
150000000000000000000000000000000cant be fitted anywhere
*/