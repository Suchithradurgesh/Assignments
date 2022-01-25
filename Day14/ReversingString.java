import java.util.*;
public class ReversingString {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    StringBuilder st=new StringBuilder(str);
    System.out.println(st.reverse().toString());
    sc.close();
}
}
/*
output:
--------

suchithra
arhtihcus

*/