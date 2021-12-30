
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            
            for(int j=n;j>=i;j--){
                char ch=(char)('A'+j-1);
                System.out.print(ch +" ");
            }

            System.out.println();

        }
        sc.close();
    }
}
/*
output:
--------


5
E 
E D
E D C
E D C B
E D C B A 

*/