


import java.util.Scanner;
import java.util.regex.*;
public class ReplaceTheSpace{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String regex="\\s+";
        Pattern pr=Pattern.compile(regex);
        Matcher matcher=pr.matcher(str);
        String result=matcher.replaceAll(" ");
        System.out.println(result);
        sc.close();
    }
}

/*

output:
--------

the     spaces are   considered as      one
the spaces are considered as one

*/
