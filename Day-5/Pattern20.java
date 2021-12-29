import java.util.Scanner;
public class Pattern20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            char ch=65;
            for(int j=1;j<=i;j++){
                System.out.print(ch +" ");
                ch++;

            }

            System.out.println();

        }
        sc.close();
    }
}

/*OUTPUT:
//-------
5
A B C D E 
A B C D 
A B C 
A B 
A

*/