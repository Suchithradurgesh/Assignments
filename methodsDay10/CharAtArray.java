import java.util.Scanner;
public class CharAtArray{
    public static void main(String args[]){
        int x=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
        char Alphabets[]=new char[str.length()];
        Alphabets[x]=str.charAt(i);
        x++;
        System.out.println(i+"-"+Alphabets[i]);
        sc.close();

        }

    }
}
//output:
//-------
//suchithra
//0-s
//1-u
//2-c
//3-h
//4-i
//5-t
//6-h
//7-r
//8-a
