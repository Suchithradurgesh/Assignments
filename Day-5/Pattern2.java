import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            
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
-------

5
E D C B A 
E D C B
E D C
E D
E

*/
