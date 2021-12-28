import java.util.Scanner;
public class Concat{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=sc.nextLine();
        String s4=s1.concat(" ").concat(s2).concat(" ").concat(s3);
        System.out.println(s4);
        sc.close();
    }
}
//output:
//-------
//viritha 
//is a 
//bad girl
//viritha is a  bad girl