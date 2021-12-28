import java.util.Scanner;
 class Pattern6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){ //rows
            for(int j=i;j>=1;j++){
                System.out.print(" * ");
            }
             System.out.println();
        }
        sc.close();
    }
}