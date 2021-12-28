import java.util.Scanner;
public class Pattern12 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int temp=1;
    for(int i=n;i>=1;i--){
        for(int k=n-1;k>=1;k--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
        System.out.print(temp+" ");

        temp++;
        }
System.out.println();
    }
    sc.close();
}    
}
//output:
//------
//5
    //1 2 3 4 5 
    //6 7 8 9
    //10 11 12
    //13 14
    //15