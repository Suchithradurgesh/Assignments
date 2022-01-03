import java.util.Scanner;
public class StringIndexOutOfBound{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("length of the string: "+str.length());
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        System.out.println(str.charAt(40));
        sc.close();
    }
}

/*

output:
-------

hello suchithra
length of the string: 15
h
e
l
l
o

s
u
c
h
i
t
h
r
a
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 40
        at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
        at java.base/java.lang.String.charAt(String.java:1512)
        at StringIndexOutOfBound.main(StringIndexOutOfBound.java:10)


        */