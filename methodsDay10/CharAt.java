import java.util.*;
public class CharAt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=sc.nextInt();
        try{
        System.out.println(str.charAt(i));
        }
        catch(Exception e){
          System.out.println("the index given is greater the length of the string");
          System.out.println("so,please enter the valid index");

        }
        sc.close();
    }
}
//output:
//-------
//suchi
//8
//the index given is greater the length of the string
//so,please enter the valid index
