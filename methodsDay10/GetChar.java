
import java.util.Scanner;
public class GetChar{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    char[] ch=new char[str.length()];
    try{
    str.getChars(3,str.length(),ch,0);
    System.out.println(ch);
    }
    catch(Exception e){
        System.out.println(e);
    }
sc.close();

}
}
//output:
//-------
//iam suchithra from dharmavaram
 //suchithra from dharmavaram