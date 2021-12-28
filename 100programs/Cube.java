import java.util.*;
public class Cube{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        double n=sc.nextDouble();
        double k=sc.nextDouble();
        System.out.println("the user input is " +n);
       double value=(double)(Math.pow(n,k));
        System.out.println("cube of given number is " +value);
    }
}