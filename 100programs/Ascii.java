//program to print the Ascii value of the given character.

import java.util.Scanner;
public class Ascii{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int equivalentASCII=(int)ch;
        System.out.println("user input is:"+(char)equivalentASCII);
        System.out.println("the equivalent ASCII value is "+equivalentASCII);
        sc.close();

    }
}
/*
output
------
s
user input is:s
the equivalent ASCII value is 115

D
user input is:D
the equivalent ASCII value is 68

*/