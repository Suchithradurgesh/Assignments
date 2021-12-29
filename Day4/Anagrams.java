import java.util.*;
public class Anagrams{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        boolean status=true;
        if(a.length()!=b.length()){
            status=false;
        }
        else{
        char[] Array1=a.toLowerCase().toCharArray();
        char[] Array2=b.toLowerCase().toCharArray();
        Arrays.sort(Array1);
        Arrays.sort(Array2);
        status=Arrays.equals(Array1,Array2);
        }
        if(status){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("not Anagrams");
        }
        sc.close();
    }
}
/*
output:
--------
Anagram
managram
not Anagrams

Hello
hello
Anagrams

*/