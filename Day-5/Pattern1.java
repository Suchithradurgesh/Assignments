import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=n;k>=i;k--){
                System.out.print(" ");
            }
                for(int j=i;j>=1;j--){
                    System.out.print(i+"");
                    
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
 55555
  4444
   333
    22
     1

     */