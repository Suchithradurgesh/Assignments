import java.util.Scanner;
public class CompareTo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int result=s1.compareTo(s2);
        System.out.println(result);
        sc.close();
    }
}
//output:
//-------
//Suchi
//Suchi
//0
//PS C:\suchi\javaprograms\Day10> java CompareTo
//suchithra
//viritha
//-3
//PS C:\suchi\javaprograms\Day10> java CompareTo      
//viritha
//suchithra
//3