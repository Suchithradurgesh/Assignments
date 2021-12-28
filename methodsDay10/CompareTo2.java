import java.util.Scanner;
public class CompareTo2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=sc.nextLine();
        System.out.println(s1.compareTo(s2));//it returns difference of string lexiographically
        System.out.println(s1.compareTo(s3));//the given string is empty so,it will return the length of the string 1
        System.out.println(s3.compareTo(s1));//it returns the negative value of length of String1
        sc.close();

    }
}
//output:
//-------
//suchithra
//suchithra

//0
//9
//-9
