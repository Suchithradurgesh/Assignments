import java.util.Scanner;
class Conditional{
public static void main(String args[]){
    int n;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the number");
    n=sc.nextInt();
    sc.close();
    if(n%2==0){
        if(n>=2&&n<=5){
        System.out.println("Not weird");
    }
    else
    if(n>=6&&n<=20){
        System.out.println("weird");
    }
    }
    else
    if(n>20){
        System.out.println("not weird");
    }
    else{
        System.out.println("weird");
    }

            }
}
/*
enter the number
3
 not weird
6
weird
8785
not weird
*/