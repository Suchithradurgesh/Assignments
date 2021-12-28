import java.util.*;
public class StringToChar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        for(int i=0;i<str.length();i++){
            System.out.println(ch[i]);
        }
        sc.close();
    }
}
//output:
//-------
//suchithra
//s
//u
//c
//h
//i
//t
//h
//r
//a
