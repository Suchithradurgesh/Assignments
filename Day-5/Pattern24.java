import java.util.Scanner;
public class Pattern24 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){        
                for(int j=i;j<=n;j++){
                    System.out.print((char)('A'+j-1)+" ");
                    
                }
                System.out.println();
            }
            sc.close();
        }    
}
/*

5
E 
D E
C D E
B C D E
A B C D E

*/