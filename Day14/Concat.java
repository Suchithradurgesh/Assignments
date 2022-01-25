import java.util.*;
public class Concat {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String result=str1+" "+str2;
        System.out.println(result);
        sc.close();
    }
}
/*
output:
--------

hello
world
hello world

*/
