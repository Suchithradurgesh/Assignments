import java.util.Scanner;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println("original string is:"+a);
        String reverstring=(new StringBuffer(a)).reverse().toString();
        System.out.println("reversed string is:"+reverstring);
        if(a.equalsIgnoreCase(reverstring)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
}