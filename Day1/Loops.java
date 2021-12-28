import java.util.Scanner;
public class Loops{
    public static void main(String args[]){
        int result;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<11;i++){
            result=n*i;
            System.out.println(n+"X"+i+"="+result);
        }
    }
}
/*
output:
-------
enter the number
8
8X1=8
8X2=16
8X3=24
8X4=32
8X5=40
8X6=48
8X7=56
8X8=64
8X9=72
8X10=80

*/