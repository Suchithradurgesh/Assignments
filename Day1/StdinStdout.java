import java.util.Scanner;
public class StdinStdout{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values");
        int i=sc.nextInt();
        double d=sc.nextDouble();
        sc.nextLine();
        String s=sc.nextLine();
        sc.close();
        System.out.println("String:" +s);
        System.out.println("double:" +d);
        System.out.println("int:" +i);


    }
}
/*
output:
--------
42
3.1415
happy learning....
String:happy learning....
double:3.1415
int:42
*/