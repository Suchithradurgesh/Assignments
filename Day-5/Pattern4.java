import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int k=n;k>=i;k--){
                System.out.print(" ");
            }
            
            for(int j=0;j<=i;j++){
                char ch=(char)('A'+i+0);
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
      A 
     B B
    C C C
   D D D D 
  E E E E E

  */
