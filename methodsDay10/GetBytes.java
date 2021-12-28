import java.util.Scanner;
public class GetBytes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        byte[] b=str.getBytes();
        for(int i =0;i<b.length;i++){
            System.out.println(b[i]);
        }
        String str1=new String(b);
        System.out.println(str1);
        sc.close();
    }
} 
//output:
//-------
//suchithra
//115
//117
//99
//104
//105
//116
//104
//114
//97
//suchithra

